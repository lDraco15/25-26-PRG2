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
    }

    public Fraccion(Fraccion fraccion) {
    }

    public Fraccion() {
    }

    public Fraccion clonar() {
        return null;
    }

    public void sumar(Fraccion fraccion) {
        int nuevoNumerador = (this.numerador * fraccion.denominador) + (this.denominador * fraccion.numerador);
        int nuevoDenominador = this.denominador * fraccion.denominador;

        int mcd = this.calcularMCD(nuevoNumerador, nuevoDenominador);

        this.numerador = nuevoNumerador / mcd;
        this.denominador = nuevoDenominador / mcd;

    }

    public void sumarNumeroEntero(int numero) {
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

    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }

    public String toString() {
        return "";
    }

    public void invertir() {
    }

    public void oponer() {
    }

}
