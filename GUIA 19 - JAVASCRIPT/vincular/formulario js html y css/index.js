//https://www.youtube.com/watch?v=iN0xYdgRAzk

//Seleccionar a todos los elementos que tengan la clase o formulario__input, en un array, por ello voy a recorrer con un for
var inputs = document.getElementsByClassName("formulario__input");
for (var i = 0; i < inputs.length; i++) {
  inputs[i].addEventListener("keyup", function () {
    // keyup es cuando el usuario termina de escribir
    if (this.value.length >= 1) {
      this.nextElementSibling.classList.add("fijar"); //Esta clase no existe en html, se cre+o en Css solamente
    } else {
      this.nextElementSibling.classList.remove("fijar");
    }
  });
}
