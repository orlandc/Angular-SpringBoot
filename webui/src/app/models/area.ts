export class Area {
    id: number;
    nombre: string;

    constructor(areaObject: any) {
        this.id = areaObject.id;
        this.nombre = areaObject.address;
    }
}