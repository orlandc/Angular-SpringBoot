import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Typenui } from '../models/typenui';

@Injectable({
  providedIn: 'root'
})
export class TypenuiService {

  typenuiURL = 'http://192.168.1.6:8080/typenui';

  constructor(private HttpClient: HttpClient) { }

  public lista(): Observable<Typenui[]> {
    return this.HttpClient.get<Typenui[]>(this.typenuiURL);
  }
}
