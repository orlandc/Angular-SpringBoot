import { Component, OnInit } from '@angular/core';

import { Employee } from '../models/employee';
import { EmployeeService } from '../service/employee.service';
import { ToastrService } from 'ngx-toastr';
import { TokenService } from '../service/token.service';

@Component({
  selector: 'app-lista-employee',
  templateUrl: './lista-employee.component.html',
  styleUrls: ['./lista-employee.component.scss']
})
export class ListaEmployeeComponent implements OnInit {

  employees:  Employee[] = [];
  roles: string[];
  isAdmin = false;

  p: number;

  constructor(
    private employeeService: EmployeeService,
    private toastr: ToastrService,
    private tokenService: TokenService
  ) { }

  ngOnInit() {
    this.cargarEmplooyees();
    this.roles = this.tokenService.getAuthorities();
    this.roles.forEach(rol => {
      if (rol === 'ROLE_ADMIN') {
        this.isAdmin = true;
      }
    });
  }

  cargarEmplooyees(): void {
    this.employeeService.lista().subscribe(
      data => {
        this.employees = JSON.parse(JSON.stringify(data));
      },
      err => {
        console.log(err);
      }
    );
  }

  borrar(id: number) {
    this.employeeService.delete(id).subscribe(
      data => {
        this.toastr.success('Empleado Eliminado', 'OK', {
          timeOut: 3000, positionClass: 'toast-top-center'
        });
        this.cargarEmplooyees();
      },
      err => {
        this.toastr.error(err.error.mensaje, 'Eeror de Ransaccion', {
          timeOut: 3000, positionClass: 'toast-top-center',
        });
      }
    );
  }
}
