import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { of } from 'rxjs';

import { EmployeeService } from '../service/employee.service';
import { AreaService } from '../service/area.service';
import { SubareaService } from '../service/subarea.service';
import { TypenuiService } from '../service/typenui.service';

import { Employee } from '../models/employee';
import { Typenui } from '../models/typenui';
import { SubArea } from '../models/subarea';
import { Area } from '../models/area';


@Component({
  selector: 'app-detalle-employee',
  templateUrl: './detalle-employee.component.html',
  styleUrls: ['./detalle-employee.component.scss']
})
export class DetalleEmployeeComponent implements OnInit {
  employee: Employee = null;

  constructor(
    private employeeService: EmployeeService,
    private typenuiService: TypenuiService,
    private areaService: AreaService,
    private subareaService: SubareaService,
    private activatedRoute: ActivatedRoute,
    private toastr: ToastrService,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params.id;
    this.employeeService.detail(id).subscribe(
      data => {
        this.employee = data;
      },
      err => {
        this.toastr.error(err.error.message, 'Error' , {
          timeOut: 3000,
          positionClass: 'toast-top-center'
        });
        this.goBack();
      }
    );
  }

  goBack() {
    this.router.navigate(['/lista']);
  }

}
