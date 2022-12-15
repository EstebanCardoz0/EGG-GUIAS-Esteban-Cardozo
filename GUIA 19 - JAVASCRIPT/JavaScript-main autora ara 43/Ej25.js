let inputNombre = document.getElementById("nombre");
let inputApellido = document.getElementById("apellido");

let botonRegistro = document.getElementById("registro");

botonRegistro.addEventListener("click" , (e) => {
//evitamos el comportamiento natural de un boton --> enviar informacion por lo tanto se recargaria la pag y perdemos la info
    e.preventDefault() 
    console.log(`Nombre: `, inputNombre.value)
    console.log(`Apellido: `, inputApellido.value)
})

inputNombre.addEventListener("change", (e) => { //evento para obtener el valor del input
     console.log(e.target.value)    
 })


