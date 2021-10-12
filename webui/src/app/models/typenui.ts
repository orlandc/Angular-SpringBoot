export class Typenui{
    id: number;
    nombres: string;

    constructor(typenuiObject: any) {
        this.id = typenuiObject.id;
        this.nombres = typenuiObject.nombres;
    }
}