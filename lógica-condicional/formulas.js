// PUNTO 1
function calcularPromedio()
{
// Tiempos 
const tiempo1 = parseFloat(document.getElementById("tiempo1").value);
const tiempo2 = parseFloat(document.getElementById("tiempo2").value);
const tiempo3 = parseFloat(document.getElementById("tiempo3").value);
const tiempo4 = parseFloat(document.getElementById("tiempo4").value);
const tiempo5 = parseFloat(document.getElementById("tiempo5").value);

const sumaTiempos = tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5;

// Promedio
const numPruebas = 5;
const promedio = sumaTiempos / numPruebas;

// Resultados
document.getElementById("resultado").value = promedio.toFixed(2); 
}

// PUNTO 2
function calcular() 
{
    const baseMayor = parseFloat(document.getElementById("baseMayor").value);
    const baseMenor = parseFloat(document.getElementById("baseMenor").value);
    const altura = parseFloat(document.getElementById("altura").value);

    // Cálculos
    const area = ((baseMayor + baseMenor) * altura) / 2;
    const litrosPesticida = area * 1.5;
    const longitudCerca = 2 * (baseMayor + baseMenor) + 2 * altura;

    // Resultados
    document.getElementById("resultado-2").value = `Litros de pesticida: ${litrosPesticida.toFixed(2)} L | Longitud de la cerca: ${longitudCerca.toFixed(2)} m`;
    document.getElementById("resultado-2").innerText = `Litros de pesticida: ${litrosPesticida.toFixed(2)} L | Longitud de la cerca: ${longitudCerca.toFixed(2)} m`;
}

// PUNTO 3
function calcularLadrillos() 
{
    const L = parseFloat(document.getElementById('longitud').value);
    const A = parseFloat(document.getElementById('altura').value);
    const l = 24; // Longitud del ladrillo 
    const a = 9; // Altura del ladrillo 
    const g = 1.5; // Grosor 

    const ladrillosNecesarios = (L * A) / ((l + g) * (a + g));

    // Resultados
    document.getElementById("resultado-3").value = ladrillosNecesarios.toFixed(2);
}


// PUNTO 4
function calcularIMC()
{
    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseFloat(document.getElementById("altura").value) / 100; // Convertir a metros

    // Cálculos
    const imc = (peso / (altura * altura)).toFixed(2);

    // Resultado
    document.getElementById("resultado-4").value = imc;

    // Condicional
    let estadoSalud = "";
    if (imc < 18.5) {
        estadoSalud = "Bajo peso";
    } else if (imc >= 18.5 && imc < 24.9) {
        estadoSalud = "Normal";
    } else if (imc >= 25 && imc < 29.9) {
        estadoSalud = "Sobrepeso";
    } else {
        estadoSalud = "Obesidad";
    }

    // Estado
    document.getElementById("estado").innerText = estadoSalud;
}

// PUNTO 5
function calcularSalario() {
    
    const diasTrabajados = parseInt(document.getElementById('diasTrabajados').value);
    const horasExtrasDiurnas = parseInt(document.getElementById('horasExtrasDiurnas').value);
    const horasExtrasNocturnas = parseInt(document.getElementById('horasExtrasNocturnas').value);
    const horasExtrasFestivas = parseInt(document.getElementById('horasExtrasFestivas').value);

    // Valores que son constantes
    const valorDia = 43000;
    const valorHoraExtraDiurna = 6915;
    const valorHoraExtraNocturna = 9681;
    const valorHoraExtraFestiva = 11064;

    // Cálculos
    const salarioBase = diasTrabajados * valorDia;
    const pagoHorasExtras = (horasExtrasDiurnas * valorHoraExtraDiurna) + (horasExtrasNocturnas * valorHoraExtraNocturna) + 
                            (horasExtrasFestivas * valorHoraExtraFestiva);
    const totalDevengado = salarioBase + pagoHorasExtras;
    const descuentoSalud = totalDevengado * 0.04;
    const descuentoPension = totalDevengado * 0.04;
    const descuentoAlimentacion = totalDevengado * 0.03;
    const totalDescuentos = descuentoSalud + descuentoPension + descuentoAlimentacion;
    const salarioNeto = totalDevengado - totalDescuentos;

    // Resultado
    document.getElementById('resultado').value = salarioNeto.toFixed(2);
}