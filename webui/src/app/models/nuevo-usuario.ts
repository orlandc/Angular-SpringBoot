export class NuevoUsuario {
    userName: string;
    password: string;
    constructor(nombreUsuario: string, password: string) {
        this.userName = nombreUsuario;
        this.password = password;
    }
}