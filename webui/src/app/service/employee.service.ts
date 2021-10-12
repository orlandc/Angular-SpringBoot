import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../models/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employeeURL = 'http://192.168.1.6:8080/employe';

  constructor(private HttpClient: HttpClient) { }

  public lista(): Observable<Employee[]> {
    return this.HttpClient.get<Employee[]>(this.employeeURL);
  }

  public detail(id: number): Observable<Employee> {
    return this.HttpClient.get<Employee>(this.employeeURL + `/${id}`);
  }

  public detailName(nombre: string): Observable<Employee> {
    return this.HttpClient.get<Employee>(this.employeeURL + `/query/${nombre}`);
  }

  public save(employee: Employee): Observable<any> {
    return this.HttpClient.post<any>(this.employeeURL, employee);
  }

  public update(employee: Employee): Observable<any> {
    return this.HttpClient.post<any>(this.employeeURL, employee);
  }

  public delete(id: number): Observable<any> {
    return this.HttpClient.delete<any>(this.employeeURL + `/${id}`);
  }
}
