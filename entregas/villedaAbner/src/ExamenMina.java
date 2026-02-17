import java.util.Scanner;

public class ExamenMina {

	static int[][] mapa = {
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }
	};

	// Posiciones Random de la mina
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int colocarMinas = 0;
		while (colocarMinas < 5) {
			int posicionMinaY = (int) (Math.random() * 7);
			int posicionMinaX = (int) (Math.random() * 5);
			if(mapa[posicionMinaX][posicionMinaY] == 1){
			posicionMinaX++;
			posicionMinaY++;
			mapa[posicionMinaX][posicionMinaY] = 1;

			}else{
			mapa[posicionMinaX][posicionMinaY] = 1;
			}
			colocarMinas++;
		}

		int posicionX = 0, posicionY = 0, haTerminado = 1, valoresCorrectos, contadorMapa = 0, contadorMinas = 0;
		///////////// Comienza el juego
		while (haTerminado == 1) {
			for (int i = 0; i < mapa.length; i++) {
				for (int j = 0; j <= mapa.length + 1; j++) {
					System.out.print(mapa[i][j]);
				}
				System.out.println(" ");
			}
			valoresCorrectos = 0;// reseteo de la variable
			while (valoresCorrectos == 0) {
				System.out.println(" ");
				System.out.println("Ingrese X");
				posicionY = sc.nextInt();
				System.out.println("Ingrese Y");
				posicionX = sc.nextInt();
				if (posicionX > 5) {
					valoresCorrectos = 0;
				} else if (posicionY > 7) {
					valoresCorrectos = 0;
				} else {
					valoresCorrectos = 1;
				}
			}

			if (mapa[posicionX][posicionY] == 1) {
				mapa[posicionX][posicionY] = 3;
				contadorMinas++;
			} else if (mapa[posicionX][posicionY] == 0) {
				mapa[posicionX][posicionY] = 2;
			} else {
				System.out.println("No es correcta esa opcion.");
			}

			contadorMapa++;
			if (contadorMinas > 2) {
				haTerminado = 0;
				System.out.println("Has perdido");
			} else if (contadorMapa >= 31) {
				System.out.println("Felicidades Ganador!");
				haTerminado = 0;
			} else {

			}
		}
	}

}