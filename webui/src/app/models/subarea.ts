import { Area } from "./area";

export class SubArea {
    id: number;
    nombre: string;
    areaModel: Area;

    constructor(subareaObject: any) {
        this.id = subareaObject.id;
        this.nombre = subareaObject.nombre;
        this.areaModel = subareaObject.area;
    }
}
