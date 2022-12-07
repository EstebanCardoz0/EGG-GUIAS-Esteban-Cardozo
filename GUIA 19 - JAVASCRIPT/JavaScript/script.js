// console.warn("Hola desde el script js");

// console.log("Hola desde el log");

// var edad= prompt("que edad tenes?", 29);

// alert("hola, tenes "+edad+" años");  

var persona = {
    apellido: "Cardozo", nombre: "Esteban", dni: 38714397, nacimiento: new Date("05-01-2000"),
    mascota: { apodo: "chiquito", id: 555, nacimiento: new Date("01-05-1995") }
};

// var mascota={apodo:"chiquito", id:555,nacimiento:new Date("01-05-1995")};

class Mascotas{ apodo;id;}
var m=new Mascotas();

m.apodo="filomena";
m.id=34;

var numeros=[1,2,3,4,5]

var personas=[{nombre:"esteban", apellido:"cardozo"},{nombre:"euge", apellido:"torres"},
{nombre:"walter", apellido:"cardozo"},{nombre:"sonia", apellido:"mendoza"}];


console.log(numeros[0]);  
//para ver el ultimo objeto de un array: array[array.lenght()-1]