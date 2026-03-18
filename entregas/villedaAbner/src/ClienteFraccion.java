public class ClienteFraccion {
    public static void main(String[] args) {
        Fraccion unMedio = new Fraccion(1, 2);
        Fraccion unTercio = new Fraccion(1, 3);
        Fraccion dosCuartos = new Fraccion(2, 4);
        System.out.println("¿Es 1/2 igual que 2/4?");
        
        System.out.println(unMedio.equals(dosCuartos)); 
        
        System.out.println("¿Es 1/3 igual que 1/2?");   
        System.out.println(unTercio.equals(unMedio));

    }
}
