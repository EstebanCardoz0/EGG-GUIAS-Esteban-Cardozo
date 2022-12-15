const form = document.querySelector("#form");
let respuesta = document.getElementById("respuesta");
const respuestaDiv = document.querySelector("#respuestaDiv");

window.onload = (e) => {
  e.preventDefault();
  principio();
};

function principio() {
  respuestaDiv.style.display = "none";
  form.addEventListener("submit", (e) => {
    console.log("aca principio");
    var ingreso = document.querySelector("#ingresoDato").value;
    ingreso = ingreso.replace(/,/g, ".");
    ingreso = parseFloat(ingreso);
    e.preventDefault();
    if (!isNaN(ingreso)) {
      console.log("es un numero");
      if (ingreso === 0) {
        console.log("es cero");
        respuestaDiv.style.display = "block";
        respuesta.textContent = ` El menor ingresado es: ${menor}, el mayor ingresado es ${mayor}, el promedio es: ${promedio}`;
      } else {
        console.log("suma");
        ingresos.push(ingreso);
        function comparar(a, b) {
          return a - b;
        }
        ingresos.sort(comparar);
        suma = suma + ingreso;
        cont++;
        promedio = suma / cont;
        respuestaDiv.style.display = "block";
        respuesta.textContent = ` valor ingresado: ${ingreso}, Ingrese otro numero`;
      }
    } else {
      console.log("no es num");
      respuestaDiv.style.display = "block";
      respuesta.textContent = ` El valor ingresado no es un numero, vuelva a intentarlo`;
    }
    menor = ingresos[0];
    mayor = ingresos[ingresos.length - 1];
  });
}