import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { NuevoUsuario } from '../models/nuevo-usuario';
import { LoginUsuario } from '../models/login-usuario';
import { JwtDTO } from '../models/jwt-dto';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  authURL = 'http://192.168.1.6:8080/auth/';

  constructor(private httpClient: HttpClient) { }

  public nuevo(NuevoUsuario: NuevoUsuario) {
    return this.httpClient.post<any>(this.authURL + 'nuevo', NuevoUsuario);
  }

  public login(LoginUsuario: LoginUsuario) {
    return this.httpClient.post<JwtDTO>(this.authURL + 'login', LoginUsuario);
  }
}
