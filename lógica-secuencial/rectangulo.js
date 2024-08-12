// Cambia de documento
document.getElementById("circulo").onclick = function (event) {
    window.location.href = "circulo.html";
};
// Limpia los imputs
document.getElementById('calculator').reset();

// Llamar funciones y establecer eventos
document.getElementById('calcular').addEventListener('click', function(event) {
    event.preventDefault();
    calcularArea();
    calcularPerimetro()
});

// Validación de números negativos
document.getElementById('base').addEventListener('change', function (e) {
    if (e.target.value < 0) {
        alert('La base no puede ser negativa.');
        e.target.value = ''; // Limpia el imput
    }
});

// Validación de números negativos
document.getElementById('altura').addEventListener('change', function (e) {
    if (e.target.value < 0) {
        alert('La altura no puede ser negativa.');
        e.target.value = ''; // Limpia el imput
    }
});

// Calcula el área
function calcularArea() {
    let num1 = parseFloat(document.getElementById('base').value);
    let num2 = parseFloat(document.getElementById('altura').value);
    if (!isNaN(num1) && !isNaN(num2)) {
        let area = num1 * num2;
        document.getElementById('area').value = area.toFixed(2);
    }
}

// Calcula el perímetro
function calcularPerimetro() {
    let num1 = parseFloat(document.getElementById('base').value);
    let num2 = parseFloat(document.getElementById('altura').value);
    if (!isNaN(num1) && !isNaN(num2)) {
        let perimetro = 2 * (num1 + num2);
        document.getElementById('perimetro').value = perimetro.toFixed(2);
    }
}


