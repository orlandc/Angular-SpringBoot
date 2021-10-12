import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IndexComponent } from './index/index.component';
import { LoginComponent } from './auth/login.component';
import { RegistroComponent } from './auth/registro.component';

import { ListaEmployeeComponent } from './employee/lista-employee.component';
import { DetalleEmployeeComponent } from './employee/detalle-employee.component';
import { EditarEmployeeComponent } from './employee/editar-employee.component';
import { NuevoEmployeeComponent } from './employee/nuevo-employee.component';

const routes: Routes = [
  { path: '', component: IndexComponent },
  { path: 'login', component: LoginComponent },
  { path: 'registro', component: RegistroComponent },
  { path: 'lista', component: ListaEmployeeComponent },
  { path: 'detalle:id', component: DetalleEmployeeComponent },
  { path: 'nuevo', component: NuevoEmployeeComponent },
  { path: 'editar:id', component: EditarEmployeeComponent },
  { path: '**', redirectTo: '', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
