public class ClienteFraccion {
    public static void main(String[] args) {
        Fraccion unMedio = new Fraccion(1, 2);
        
        Fraccion unTercio = new Fraccion(1, 3);
    
        unMedio.multiplicar(unTercio); 
        
        unMedio.mostrar();

    }
}
