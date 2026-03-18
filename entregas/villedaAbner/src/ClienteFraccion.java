public class ClienteFraccion {
    public static void main(String[] args) {
        Fraccion unMedio = new Fraccion(1, 2);
        Fraccion unTercio = new Fraccion(1, 3);
        System.out.println("¿Es 1/2 mayor que 1/3?");
        
        System.out.println(unMedio.esMenor(unTercio)); 
        
        System.out.println("¿Es 1/3 mayor que 1/2?");   
        System.out.println(unTercio.esMenor(unMedio));

    }
}
