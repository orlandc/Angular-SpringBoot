import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { of } from 'rxjs';

import { EmployeeService } from '../service/employee.service';
import { TypenuiService } from '../service/typenui.service';

import { Employee } from '../models/employee';
import { Typenui } from '../models/typenui';
import { SubArea } from '../models/subarea';
import { Area } from '../models/area';
import { AreaService } from '../service/area.service';
import { SubareaService } from '../service/subarea.service';


@Component({
  selector: 'app-nuevo-employee',
  templateUrl: './nuevo-employee.component.html',
  styleUrls: ['./nuevo-employee.component.scss']
})
export class NuevoEmployeeComponent implements OnInit {
  typenuiarr:  Typenui[] = [];
  areaarray:  Area[] = [];
  subareaarray:  SubArea[] = [];

  nui: number = null;
  nombre: string = '';
  apellido: string = '';

  typenui: Typenui;
  subarea: SubArea;
  area: Area;

  idtypenui: number = null;
  idarea: number = null;
  idsubarea: number = null;

  errMsj: string;
  
  constructor(
    private employeeService: EmployeeService,
    private typenuiService: TypenuiService,
    private areaService: AreaService,
    private subareaService: SubareaService,
    private toastr: ToastrService,
    private router: Router
  ) { 
    // async typenui
    of(this.getTypenui()).subscribe(typenuis => {
      //console.log(typenuis);
    });

    // async areas
    of(this.getArea()).subscribe(areas => {
      //console.log(areas);
    });
  }

  ngOnInit(): void {
  }

  onCreate(): void {
    const typenuiObject = {
      id: this.idtypenui,
    }
    this.typenui = new Typenui(typenuiObject);
    const areaObject = {
      id: this.idarea,
    }
    this.area    = new Area(areaObject);
    const subareaObject = {
      id:this.idsubarea, 
      area:this.subarea
    }
    this.subarea = new SubArea(subareaObject);
    this.subarea.areaModel = this.area;

    const employeeObject = {
      nui: this.nui,
      nombre: this.nombre,
      apellido: this.apellido,
      typenui: this.typenui,
      subarea: this.subarea,
      area: this.area
    };
    
    const employee =  new Employee(employeeObject);
    this.employeeService.save(employee).subscribe(
      data => {
        this.toastr.success('Empleado creado correctamente', 'OK', {
          timeOut: 3000,  positionClass: 'toast-top-center',
        });
        this.router.navigate(['/lista']);
      },
      err => {
        this.errMsj = err.error['mensaje'];
        this.toastr.error(this.errMsj, 'Error en registro', {
          timeOut: 3000,  positionClass: 'toast-top-center'
        });
        this.router.navigate(['/lista']);
      }
    );
  }

  getTypenui() {
    this.typenuiService.lista().subscribe(
      data => {
        this.typenuiarr = JSON.parse(JSON.stringify(data));
      },
      err => {
        console.log(err);
      }
    );
  }

  getArea() {
    this.areaService.lista().subscribe(
      data => {
        this.areaarray = JSON.parse(JSON.stringify(data));
      },
      err => {
        console.log(err);
      }
    );
  }

  changeArea(event) {
    const { target } = event
    if (target) {
      //console.log(target.value);
      this.getSubArea(target.value);
    }
  }

  getSubArea(id: number) {
    this.subareaService.lista(id).subscribe(
      data => {
        this.subareaarray = JSON.parse(JSON.stringify(data));
      },
      err => {
        console.log(err);
      }
    );
  }

}
