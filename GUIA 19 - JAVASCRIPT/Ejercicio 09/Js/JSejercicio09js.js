// Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
// funcionamiento de la función Substring().

var frase= prompt("Ingresá una frase mi rey");
var final="";

for (let index = 0; index < frase.length; index++) {
    
   // alert(frase.substring(index,index+1));

   final=final+" "+frase.substring(index,index+1);
}


alert(final);





