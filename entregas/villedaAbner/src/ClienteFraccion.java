public class ClienteFraccion {
    public static void main(String[] args) {
    Console console = new Console();         
        
    Fraccion unMedio = new Fraccion(1, 2);
    Fraccion unCuarto = new Fraccion(1,4);

    Fraccion resultado = unMedio.sumar(unCuarto);
    console.writeln("La suma es: " + resultado);
    console.writeln("Un medio: " + unMedio+ "   Un cuarto: " + unCuarto);
    }
}
