const titulo = document.getElementById("miTitulo");

console.log(titulo.textContent = "Holaaaaaaaaaaa");

titulo.style.color = "blue";

const nuevoParrafo = document.createElement("p");

nuevoParrafo.textContent = "Hola desde JS";

document.body.appendChild(nuevoParrafo);

//titulo.remove();