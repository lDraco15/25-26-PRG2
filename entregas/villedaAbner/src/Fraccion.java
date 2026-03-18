public class Fraccion {

    private int numerador;
    private int denominador;

    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public Fraccion(int numerador, int denominador) {
        int mcd = this.calcularMCD(numerador, denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    public Fraccion(int numero) {
        this.numerador = numero;
        this.denominador = 1;
    }

    public Fraccion(Fraccion fraccion) {
        this.numerador = fraccion.numerador;
        this.denominador = fraccion.denominador;
        
    }

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion clonar() {
        return new Fraccion(this);
    }

    public void sumar(Fraccion fraccion) {
        int nuevoNumerador = (this.numerador * fraccion.denominador) + (this.denominador * fraccion.numerador);
        int nuevoDenominador = this.denominador * fraccion.denominador;

        int mcd = this.calcularMCD(nuevoNumerador, nuevoDenominador);

        this.numerador = nuevoNumerador / mcd;
        this.denominador = nuevoDenominador / mcd;

    }


    public void restar(Fraccion fraccion) {
        int nuevoNumerador = (this.numerador * fraccion.denominador) - (this.denominador * fraccion.numerador);
        int nuevoDenominador = this.denominador * fraccion.denominador;

        int mcd = this.calcularMCD(nuevoNumerador, nuevoDenominador);

        this.numerador = nuevoNumerador / mcd;
        this.denominador = nuevoDenominador / mcd;
    }

    public void multiplicar(Fraccion fraccion) {
        this.numerador = this.numerador * fraccion.numerador;
        this.denominador = this.denominador * fraccion.denominador;
    }

    public void dividir(Fraccion fraccion) {
        int nuevoNumerador = this.numerador * fraccion.denominador;
        int nuevoDenominador = this.denominador * fraccion.numerador;

        int mcd = this.calcularMCD(nuevoNumerador, nuevoDenominador);

        this.numerador = nuevoNumerador / mcd;
        this.denominador = nuevoDenominador / mcd;
    }

    public boolean esMayor(Fraccion fraccion) {
        int miValorCruzado = this.numerador * fraccion.denominador;
        int otroValorCruzado = this.denominador * fraccion.numerador;

        return miValorCruzado > otroValorCruzado;
    }

    public boolean esMenor(Fraccion fraccion) {
        int miValorCruzado = this.numerador * fraccion.denominador;
        int otroValorCruzado = this.denominador * fraccion.numerador;

        return miValorCruzado > otroValorCruzado;
    }

    public boolean equals(Fraccion fraccion) {
        return this.numerador == fraccion.numerador && this.denominador == fraccion.denominador;
    }
    public double decimal() {
        double dividendo = this.numerador;
        double divisor = this.denominador;

        return dividendo/divisor;
    }

    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }

    public String toString() {
        return "";
    }

    public void invertir() {
        int temporal = this.numerador;

        this.numerador = this.denominador;
        this.denominador = temporal;
    }

    public void oponer() {
        this.numerador = this.numerador * -1;
    }

}
