abstract class Operacion{

    protected double numero1;
    protected double numero2;

    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public abstract double Operar();
}

class Sumar extends Operacion{

    public Sumar(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public double Operar() {
        return numero1 + numero2;
    }
}

class Restar extends Operacion{

    public Restar (double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public double Operar() {
        return numero1 - numero2;
    }
}

class Multiplicar extends Operacion{

    public Multiplicar (double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public double Operar() {
        return numero1 * numero2;
    }
}

class Dividir extends Operacion{

    public Dividir (double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public double Operar() {
        if (numero2 == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
}

public class calculadora {
    public static void main(String[] args){
        Operacion suma = new Sumar(5, 3);
        Operacion resta = new Restar(5, 3);
        Operacion multiplicacion = new Multiplicar(5, 3);
        Operacion division = new Dividir(5, 3);

        System.out.println("Suma: " + suma.Operar());
        System.out.println("Resta: " + resta.Operar());
        System.out.println("Multiplicación: " + multiplicacion.Operar());
        System.out.println("División: " + division.Operar());
    }
}
