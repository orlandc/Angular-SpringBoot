import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Area } from '../models/area';

@Injectable({
  providedIn: 'root'
})
export class AreaService {

  areaURL = 'http://backend:8080/area';

  constructor(private HttpClient: HttpClient) { }

  public lista(): Observable<Area[]> {
    return this.HttpClient.get<Area[]>(this.areaURL);
  }

}
