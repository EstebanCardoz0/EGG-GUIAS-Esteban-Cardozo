// Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.

var num1= prompt("elegi un numero",0);
var aux1= parseInt(num1) ;

var num2= prompt("elegi otro numero",0);
var aux2= parseInt(num2) ;

var opc= prompt("Qué operacion querés realizar (s,r,m,d)")

switch (opc){

case "s": alert(aux1+aux2); break;
case "r": alert(aux1-aux2); break;
case "m": alert(aux1*aux2); break;
case "d": alert(aux1/aux2); break;
default: alert("caracter invalido");


}

// var suma= aux1+aux2;

// alert(suma);



// var num2= prompt("Ingresá el segundo número");

// alert(num1+num2);


// if (caracter=="s" ||caracter=="n"||caracter=="N"||caracter=="S") {
//     alert("CORRECTO")
// } else {
//     alert("INCORRECTO")
    
// }

