import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SubArea } from '../models/subarea';

@Injectable({
  providedIn: 'root'
})
export class SubareaService {

  subAreaURL = 'http://192.168.1.6:8080/subarea';

  constructor(private HttpClient: HttpClient) { }

  public lista(id: number): Observable<SubArea[]> {
    console.log(id)
    return this.HttpClient.get<SubArea[]>(this.subAreaURL + `/area/${id}`);
  }

}
