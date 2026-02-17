import java.util.Scanner;

public class ExamenMina {

	static int[][] mapa = {
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 },
	};

	// Posiciones Random de la mina
	public static void main(String[] args) {
		String[] tile = {
				" - ",
				" . ",
				" * "
		};
		Scanner sc = new Scanner(System.in);
		int colocarMinas = 0;
		while (colocarMinas < 6) {
			int posicionMinaY = (int) (Math.random() * 6);
			int posicionMinaX = (int) (Math.random() * 4);
			if (mapa[posicionMinaX][posicionMinaY] == 1) {
				posicionMinaX++;
				posicionMinaY++;
				mapa[posicionMinaX][posicionMinaY] = 1;

			} else {
				mapa[posicionMinaX][posicionMinaY] = 1;
			}
			colocarMinas++;
			System.out.println("La mina esta en X: " + posicionMinaY + " Y: " + posicionMinaX);
		}

		int posicionX = 0, posicionY = 0, haTerminado = 1, contadorMapa = 0, contadorMinas = 0;
		do {
			System.out.println("========================");
			System.out.println("    1  2  3  4  5  6  7");
			for (int row = 0; row < mapa.length; row++) {
				System.out.print(" " + (row + 1) + " ");
				for (int column = 0; column < mapa[row].length; column++) {
					if (mapa[row][column] == 0 || mapa[row][column] == 1) {
						System.out.print(tile[0]);
					} else if (mapa[row][column] == 2) {
						System.out.print(tile[1]);
					} else if (mapa[row][column] == 3) {
						System.out.print(tile[2]);
					}
				}
				System.out.println();
			}
			System.out.println("========================");

			System.out.println("Ingrese X");
			posicionY = sc.nextInt();
			System.out.println("Ingrese Y");
			posicionX = sc.nextInt();

			if (posicionX > 5 || posicionY > 7) {
				System.out.println("No es correcta esa opcion.");
			} else if (mapa[posicionX][posicionY] == 1) {
				mapa[posicionX][posicionY] = 3;
				System.out.println("Has caido en una mina");
				contadorMinas++;
			} else {
				mapa[posicionX][posicionY] = 2;
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
		} while (haTerminado == 1);
	}

}