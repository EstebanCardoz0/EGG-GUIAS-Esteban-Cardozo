// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.


for (let index = 0; index <= 20; index) {

    let aux = prompt("ingresá un numero");
    let aux1 = parseInt(aux);

    index=index+aux1;

    alert("La suma de los números es de "+index);

    if (index>20) {
        alert("Programa finalizado")
    }

}








