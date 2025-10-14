const btnGuardar = document.querySelector(".btnGuardar");
const nombre = document.querySelector(".nombre");
const saludo = document.querySelector(".saludo");
const apellidoPaterno = document.querySelector(".apellidoPaterno");
const apellidoMaterno = document.querySelector(".apellidoMaterno");
const date = document.querySelector(".date");



const textoguardado = localStorage.getItem("texto");
if (textoguardado != "") {
    saludo.textContent = `Guardado: ${textoguardado}`;
}

btnGuardar.addEventListener("click", () => {
  const nombreValue = nombre.value;
  const apellidoPaternoValue = apellidoPaterno.value;
  const apellidoMaternoValue = apellidoMaterno.value;
  const dateValue = date.value;
  if (nombreValue != "" && apellidoPaternoValue != "" && apellidoMaternoValue != "" && dateValue != "") {
    localStorage.setItem("texto", `${nombreValue} ${apellidoPaternoValue} ${apellidoMaternoValue}, nacido el ${dateValue}`);
    saludo.textContent = `Guardado: ${localStorage.getItem("texto")}`;
  }
});
