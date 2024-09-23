import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Operacion (es la clase padre)
abstract class Operacion {
    protected double numero1;
    protected double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public abstract double calcular();
}

// Clase Sumar
class Sumar extends Operacion {
    public Sumar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 + numero2;
    }
}

// Clase Restar
class Restar extends Operacion {
    public Restar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 - numero2;
    }
}

// Clase Multiplicar
class Multiplicar extends Operacion {
    public Multiplicar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 * numero2;
    }
}

// Clase Dividir
class Dividir extends Operacion {
    public Dividir(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
}

// Clase Potencia
class Potencia extends Operacion {
    public Potencia(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return Math.pow(numero1, numero2);
    }
}

// Clase principal
public class calculadoraV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Selecciona la operación: 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Potencia 6. Leer número del archivo");
                int opcion = scanner.nextInt();

                if (opcion >= 1 && opcion <= 5) {
                    System.out.print("Ingresa el primer número: ");
                    double numero1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double numero2 = scanner.nextDouble();

                    Operacion operacion;
                    switch (opcion) {
                        case 1:
                            operacion = new Sumar(numero1, numero2);
                            break;
                        case 2:
                            operacion = new Restar(numero1, numero2);
                            break;
                        case 3:
                            operacion = new Multiplicar(numero1, numero2);
                            break;
                        case 4:
                            operacion = new Dividir(numero1, numero2);
                            break;
                        case 5:
                            operacion = new Potencia(numero1, numero2);
                            break;
                        default:
                            throw new InputMismatchException("Opción no válida");
                    }

                    System.out.println("Resultado: " + operacion.calcular());
                } else if (opcion == 6) {
                    // Leer de el archivo
                    BufferedReader reader = new BufferedReader(new FileReader("numero.txt")); // Preferiblemente colocar la ruta del archivo
                    String linea = reader.readLine();
                    System.out.println("Número leído del archivo: " + linea);
                    reader.close();
                } else {
                    throw new InputMismatchException("Opción no válida");
                }

                System.out.println("¿Deseas realizar otra operación? (s/n)");
                char respuesta = scanner.next().charAt(0);
                if (respuesta != 's' && respuesta != 'S') {
                    continuar = false;
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida");
                scanner.next(); // Con esto se limpia el buffer del scanner
            }
        }

        scanner.close();
    }
}
