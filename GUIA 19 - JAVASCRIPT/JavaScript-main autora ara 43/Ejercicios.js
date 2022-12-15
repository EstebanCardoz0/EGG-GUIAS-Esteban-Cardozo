//Ejercicio 1

// var wheather = prompt("¿cómo está el día de hoy?");

// alert("El dia de hoy esta: " + wheather);

//Ejercicio 2
// var radio = prompt("Ingrese el valor del radio: ");
// var PI = 3.14;
// var area = PI * (radio * radio);
// var perimetro = 2 * PI * radio;

// alert("El area del radio: " + radio + " es: " + area +
//       " y el perimetro del radio: " + radio + " es: " + perimetro);

//Ejercicio 3

// var edad = prompt("Ingrese su edad: ");

// if(edad > 18){
// alert("Usted es mayor de edad");
// }else{
//     alert("Usted es menor de edad");
// }

//Ejercicio 4

// var respuesta = prompt("Ingrese S/N: ");

// if(respuesta.toUpperCase() == "S"){
//     alert("CORRECTO");
// }else{
//     alert("INCORRECTO");
// }

//Ejercicio 5

// function miFuncion(){
// var resp = prompt("Que operacion matematica desea hacer?: ");

// switch (resp) {
//     case 's' || 'S':
//         var numS1= prompt("Ingrese el numero a sumar: ");
//         var nums = prompt("Ingrese el segundo numero a sumar:");
//         let suma;
//         suma = (numS1 + nums);
//         alert("Su resultado es: " + suma);
//     break;
//     case 'R' || 'r':
//         var numR1= prompt("Ingrese el numero a restar: ");
//         var numr = prompt("Ingrese el segundo numero a restar:");
//         var resta = numR1 - num1;
//         alert("Su resultado es: " + resta);
//     break;
//     default:
//     console.log('error, operacion matematica no encontrada');
//     }
// }





// let arr = [
//     [ 3,  6 ,9],
//     [12, 15, 18]
// ];
// console.log(arr[0][0], arr[0][1], arr[0][2], arr[1][0], arr[1][1], arr[1][2]); // 1 2 3
// //console.log(arr[1][0], arr[1][1], arr[1][2]); // 4 5 6

// let seleccionar = document.querySelector('select');
// let parrafo = document.querySelector('p');

// seleccionar.addEventListener('change', establecerArrayVector);

// function establecerArrayVector() {
//     let eleccion = seleccionar.value;

    // switch (eleccion) {
    //     case "mv1":

    //             let miarray = Array.from({ length: 5 }, () => Math.floor(Math.random() * 10));
    //             document.write('<br>');
    //             document.write("Primer array de 5 numeros es: ");
    //             document.write('<br>');
    //             miarray.forEach(function (item, index, arr) {
    //                 document.write(item);
    //             });
    //             document.write('<br>');
    //             document.write('<br>');
    //             document.write("Borrando el ultimo numero del array: ");
    //             document.write('<br>');
    //             miarray.forEach(function (item, index, arr) {
    //                 document.write(item);
    //                 delete miarray[4];

    //             });

    //         break;
    //     case "mv2":

    //             let miarray2 = Array.from({ length: 5 }, () => Math.floor(Math.random() * 10));
    //             document.write('<br>');
    //             document.write("Segundo array de 5 numeros es:");
    //             document.write('<br>');
    //             miarray2.forEach(function (item, index, arr) {
    //                 document.write(item);
    //             });

    //             document.write('<br>');
    //             document.write('<br>');
    //             document.write("Borrando el ultimo numero del array: ");
    //             document.write('<br>');
    //             miarray2.forEach(function (item, index, arr) {
    //                 //console.log(item);
    //                 document.write(item);

    //                 delete miarray2[4];

    //             });
    //         break;
    //     default:
    //         break;
    // }

    let miarray = Array.from({ length: 5 }, () => Math.floor(Math.random() * 10));
    document.write('<br>');
    document.write("Primer Vector de 5 numeros es: ");
    document.write('<br>');
    miarray.forEach(function (item, index, arr) {
        document.write(item);
     });
     document.write('<br>');
    document.write('<br>');
     document.write("Borrando el ultimo numero del Vector: ");
     document.write('<br>');
    miarray.forEach(function (item, index, arr) {
        document.write(item);
        //delete miarray[4];
        miarray.splice(3,4);
 });

    let miarray2 = Array.from({ length: 5 }, () => Math.floor(Math.random() * 10));
    document.write('<br>');
    document.write('<br>');
    document.write("Segundo Vector 2 de 5 numeros es:");
    document.write('<br>');
    miarray2.forEach(function (item, index, arr) {
        document.write(item);
    });

    document.write('<br>');
    document.write('<br>');
    document.write("Borrando los ultimos 2 numeros del Vector 2: ");
    document.write('<br>');
    miarray2.forEach(function (item, index, arr) {
        document.write(item);
        //delete miarray2[4];
        miarray2.splice(3,4);
        
    });
    
//}