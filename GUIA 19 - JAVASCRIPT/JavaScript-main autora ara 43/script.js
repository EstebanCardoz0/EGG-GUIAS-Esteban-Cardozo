
//lsita de todos los tipos console que ay
// console.log("frase vista en la consola");

// console•error("mensajes de error en la consola");
// console•warn("se usa para registrar mensajes de advertencia");
// //console•clear(); //Se usa para limpiar la consola.
// console•time("123");
// console.timeEnd("123");
// console.table({ 'a': 1, 'b': 2 }); //para crear una tabla matriz

// for (let i = 0; i < 5; i++) {
//     console.count(i);
// }  //contar algo

// console•group("");
// console.groupEnd("");

//console custom
// const spacing = '10px';
// const styles = `padding: ${spacing}; background-color: black; color:
// yellow; font-style:
// italic; border: 1px solid black; font-size: 2em;`;
// console.log('%cEGG', styles);

// alert("Muestra un mensaje en forma de ventana");

// var nombre = prompt("Cual es tu nombre?"); //manda un mensaje en forma de ventana y pregunta por el nombre

// alert("Bienvenido/a " + nombre);//luego llamo a la variable y muestro en forma de ventana el mensaje y la var

//_____________________________________________________

//la creacion de los puntos json

// var persona = {
//     apellido: "Aquino",
//     nombre: "Ailen",
//     dni: 46523233,
//     nacimiento: new Date("05-31-2001"),  //mes-dia-año
//     hijo: {
//         apellido: "Aquino",
//         nombre: "Luna",
//         nacimiento: new Date("06-22-2025"),
//         dni: 34526534
//     }
// };

// console.log(persona);

// class mascota{
// nombre;
// nacimiento;
// };

// var m = new mascota();

// m.nombre = "pepe";

// m.nacimiento = new Date("06-12-2022");

// console.log(m);

//o para buscar algo mas especifico

// console.log(persona-nombre);


// var resp2;
// do {
//     var resp = prompt("Que operacion matematica desea hacer?: ");
//     switch (resp) {
//         case 's' || 'S':
//             var num = prompt("Ingrese el numero a sumar: ");
//             var num2 = prompt("Ingrese el segundo numero a sumar:");
//             var suma = parseInt(num) + parseInt(num2);
//             alert("Su resultado es: " + suma);

//             break;
//         case 'R' || 'r':
//             var num = prompt("Ingrese el numero a restar: ");
//             var num2 = prompt("Ingrese el segundo numero a restar:");
//             var resta = parseInt(num) - parseInt(num2);
//             alert("Su resultado es: " + resta);
//             break;
//         case 'm' || 'M':
//             var num = prompt("Ingrese el numero a multiplicar: ");
//             var num2 = prompt("Ingrese el segundo numero a multiplicar:");
//             var mult = parseInt(num) * parseInt(num2);
//             alert("Su resultado es: " + mult);
//             break;
//         case 'd' || 'D':
//             var num = prompt("Ingrese el numero a dividir: ");
//             var num2 = prompt("Ingrese el segundo numero a dividir");
//             if (num < num2) {
//                 alert("El primer numero es menor que el segundo, la division no se puede hacer");
//             } else {
//                 var div = parseInt(num) / parseInt(num2);
//                 alert("Su resultado es: " + div);
//             }
//             break;
//         default:
//             console.log('error, operacion matematica no encontrada');

//     }
//     resp2 = prompt("desea seguir haciendo operaciones matematicas? (si || no): ");

// } while (resp2 == 'si');


