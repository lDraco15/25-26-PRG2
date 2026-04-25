public class Carrera {

    private Caballo[] caballos;
    private Pista pista;
    private Turno turno;

    public Carrera() {
        caballos = new Caballo[2];
        for (int i = 0; i < caballos.length; i++) {
            caballos[i] = new Caballo(i + 1);
        }
        turno = new Turno();
        pista = new Pista();
    }

    public void jugar() {
        do {
            pista.mostrar();
            for (int i = 0; i < caballos.length; i++) {
            caballos[turno.toca()].avanzar();
            turno.cambiar();
        }

        } while (!pista.hayGanador() && !pista.hayEmpate());

        pista.mostrar();
        if (pista.hayEmpate()) {
            System.out.println("Hubo un empate!");
        } else {
            caballos[turno.noLeToca()].celebrar();
        }

    }

}
