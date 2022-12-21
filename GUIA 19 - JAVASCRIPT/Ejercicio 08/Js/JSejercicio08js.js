// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.

var num;
var total = 0;
var max = 0;
var min = 999999999999999;
var cantidad = 0;



do {
    let numcad = prompt("Ingrese un número");
    num = parseInt(numcad);

    total = total + num;



    if (num > max) {
        max = num;
    }

    if (num < min&&num!=0) {
        min = num;
    }

    if (num != 0) {
        cantidad++;
    }
} while ((num) !== 0);

alert("Promedio: " + (total / cantidad) + " - Maximo: " + max + " - Mínimo: " + min);

// for (let index = 0; index <= 20; index) {

//     let aux = prompt("ingresá un numero");
//     let aux1 = parseInt(aux);

//     index=index+aux1;

//     alert("La suma de los números es de "+index);

//     if (index>20) {
//         alert("Programa finalizado")
//     }

// }








