public class ClienteFraccion {
    public static void main(String[] args) {
        Fraccion unMedio = new Fraccion(1, 2);
        
        Fraccion b = unMedio.clonar();

        unMedio.oponer();

        b.mostrar();
        unMedio.mostrar();

    }
}
