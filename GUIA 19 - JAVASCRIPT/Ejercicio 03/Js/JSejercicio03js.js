//  var str= "Mi texto"; 
// document.getElementById("texto").innerHTML=str; 

var edad;

// function sub() {

//     edad = document.getElementById("prod").value;
//     //alert("Tu edad es: " + edad);

//     let resp= "Tenés "+ edad+" años";

// };

edad = window.prompt("¿Qué edad tenés?");

if (edad < 18) {
    window.alert("Sos menor de edad");

} else {
    window.alert("Sos mayor de edad");

}

