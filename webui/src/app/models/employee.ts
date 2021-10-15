import { SubArea } from "./subarea";
import { Typenui } from "./typenui";

export class Employee {
    nui: number;
    typenuiModel: Typenui;
    nombre: string;
    apellido: string;
    subareaModel: SubArea;

    constructor(employeeObject: any) {
        this.nui = employeeObject.nui;
        this.typenuiModel = employeeObject.typenui;
        this.nombre = employeeObject.nombre;
        this.apellido = employeeObject.apellido;
        this.subareaModel = employeeObject.subarea;
    }
}