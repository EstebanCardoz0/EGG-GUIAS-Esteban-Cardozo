// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.

var num;
var total = 0;
var max = 0;
var min = 0;
var cantidad = 0;

do {
    let numcad = prompt("Ingrese un número");
    num = parseInt(numcad);

    total = total + num;

    let auxmin=num;

    if (num > max) {
        max = num;
    }

    if (condition) {
        
    }

    if (num != 0) {
        cantidad++;
    }
} while ((num) !== 0);

prompt("Total: " + (total / cantidad) + " - Maximo: " + max);

// for (let index = 0; index <= 20; index) {

//     let aux = prompt("ingresá un numero");
//     let aux1 = parseInt(aux);

//     index=index+aux1;

//     alert("La suma de los números es de "+index);

//     if (index>20) {
//         alert("Programa finalizado")
//     }

// }








