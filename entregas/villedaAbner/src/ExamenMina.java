import java.util.Scanner;

public class ExamenMina {

	// Posiciones Random de la mina
	public static void main(String[] args) {
		int[][] mapa = {
				{ -1, -1, -1, -1, -1, -1, -1 },
				{ -1, 0, 0, 0, 0, 0, 0, 0 },
				{ -1, 0, 0, 0, 0, 0, 0, 0 },
				{ -1, 0, 0, 0, 0, 0, 0, 0 },
				{ -1, 0, 0, 0, 0, 0, 0, 0 },
				{ -1, 0, 0, 0, 0, 0, 0, 0 },
		};
		Scanner sc = new Scanner(System.in);
		colocarMinas(mapa);

		int posicionX = 0, posicionY = 0, contadorMapa = 0, contadorMinas = 0;
		boolean haTerminado = false;
		do {

			imprimirMapa(mapa);
			System.out.println("Ingrese X");
			posicionY = sc.nextInt();
			System.out.println("Ingrese Y");
			posicionX = sc.nextInt();

			if (posicionX > 5 || posicionY > 7 || posicionX < 0 || posicionY < 0) {
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
				haTerminado = true;
				System.out.println("Has perdido");
			} else if (contadorMapa >= 31) {
				System.out.println("Felicidades Ganador!");
				haTerminado = true;
			} else {

			}
		} while (haTerminado == false);
	}

	static void imprimirMapa(int[][] mapa) {
		String[] tile = {
				" - ",
				" . ",
				" * ",
				"========================"
		};
		System.out.println(tile[3]);
		System.out.println("    1  2  3  4  5  6  7");
		for (int row = 1; row < mapa.length; row++) {
			System.out.print(" " + row + " ");
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
		System.out.println(tile[3]);
	}

	static void colocarMinas(int[][] mapa) {
		int minas = 0;
		while (minas < 6) {
			int posicionMinaY = (int) (Math.random() * 6);
			int posicionMinaX = (int) (Math.random() * 4);
			if (mapa[posicionMinaX][posicionMinaY] == -1) {
				posicionMinaX++;
				posicionMinaY++;
				mapa[posicionMinaX][posicionMinaY] = 1;

			} else {
				mapa[posicionMinaX][posicionMinaY] = 1;
			}
			minas++;
			System.out.println("La mina esta en X: " + posicionMinaY + " Y: " + posicionMinaX);
		}
	}
}