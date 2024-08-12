// Cambia de documento
document.getElementById("triangulo").onclick = function () {
  window.location.href = "index.html";
};

// Limpia los imputs
document.getElementById("calculator").reset();

// Llamar funciones y establecer eventos
document.getElementById("calcular").addEventListener("click", function (event) {
  event.preventDefault();
  calcularArea();
  calcularPerimetro();
});

// Validación de números negativos
document.getElementById("radio").addEventListener("change", function (e) {
  if (e.target.value < 0) {
    alert("El radio no puede ser negativo.");
    e.target.value = "";
  }
});

// Calcular área
function calcularArea() {
  let radio = parseFloat(document.getElementById("radio").value);
  if (!isNaN(radio)) {
    let area = Math.PI * Math.pow(radio, 2);
    document.getElementById("area").value = area.toFixed(2);
  }
}

// Calcular Perímetro
function calcularPerimetro() {
  let radio = parseFloat(document.getElementById("radio").value);
  if (!isNaN(radio)) {
    let perimetro = 2 * Math.PI * radio;
    document.getElementById("perimetro").value = perimetro.toFixed(2);
  }
}
