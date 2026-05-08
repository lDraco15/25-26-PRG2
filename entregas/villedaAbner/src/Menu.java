public class Menu {
    private Console console;

    public int pediropcion() {
        return console.readInt();
    }

    public void mostrar() {
        console.writeln("--------------------");
        console.writeln("1. Pedir");
        console.writeln("2. Empezar de nuevo");
        console.writeln("3. Salir");
        console.writeln("--------------------");


    }

}
