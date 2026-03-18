public class ClienteFraccion {
    public static void main(String[] args) {
        Fraccion unMedio = new Fraccion(1, 2);
        Fraccion dosCuartos = new Fraccion(2, 4);
        
        unMedio.sumar(dosCuartos);
        unMedio.mostrar();

    }
}
