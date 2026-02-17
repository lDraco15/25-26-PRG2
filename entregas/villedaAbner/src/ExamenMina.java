import java.util.Scanner;

public class ExamenMina{
		
	static String[][] mapa = 	
		{ //[0][0]	[0][1]	[0][2]	[0][3]	[0][4]	[0][5]	[0][6]	[0][7]
			{" ",	"1", 	"2", 	"3", 	"4",	"5",	"6", 	"7"},
		  //[1][0]	[1][1]	[1][2]	[1][3]	[1][4]	[1][5]	[1][6]	[1][7]
			{"1", 	"0", 	"0", 	"0", 	"0", 	"0", 	"0",	"0"},
		  //[2][0]	[2][1]	[2][2]	[2][3]	[2][4]	[2][5]	[2][6]	[2][7]
			{"2", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"},
		  //[3][0]	[3][1]	[3][2]	[3][3]	[3][4]	[3][5]	[3][6]	[3][7]
			{"3", 	"0", 	"0", 	"0",	"0", 	"0", 	"0",	"0"},
		  //[4][0]	[4][1]	[4][2]	[4][3]	[4][4]	[4][5]	[4][6]	[4][7]
			{"4", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"},
		  //[5][0]	[5][1]	[5][2]	[5][3]	[5][4]	[5][5]	[5][6]	[5][7]
			{"5", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"}
		};

	//Posiciones Random de la mina
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
		///////////////////////////
		int colocarMinas = 0;	
		while ( colocarMinas < 5){
			int posicionMinaY = (int)(Math.random()*2+1);
			int posicionMinaX = (int)(Math.random()*4+1);
			if (mapa[posicionMinaX][posicionMinaY]=="1"){
			colocarMinas=colocarMinas-1;
			}
			else {
				mapa[posicionMinaX+1][posicionMinaY+1]="1";
			}
			colocarMinas++;
		}
	
		int posicionX=0, posicionY=0, haTerminado=1, valoresCorrectos, contadorMapa=0, contadorMinas=0;
		/////////////Comienza el juego
		while(haTerminado==1){
			for( colocarMinas = 0; colocarMinas<mapa.length; colocarMinas++){            
				for (int j = 0; j<=mapa.length+1; j++) {                                     
					System.out.print(mapa[colocarMinas][j]);
				}
				System.out.println(" ");
			}
			valoresCorrectos=0;//reseteo de la variable
			while(valoresCorrectos==0){
				System.out.println(" ");
				System.out.println("Ingrese X");
				posicionY = sc.nextInt();
				System.out.println("Ingrese Y");
				posicionX = sc.nextInt();
				if(posicionX>5){
					valoresCorrectos=0;
				}
				else if(posicionY>7){
					valoresCorrectos=0;
				}
				else{
					valoresCorrectos=1;
				}
			}

			if(mapa[posicionX][posicionY]=="1"){
			mapa[posicionX][posicionY]="x";
			contadorMinas++;
			}
			else if(mapa[posicionX][posicionY]=="0"){
			mapa[posicionX][posicionY]=".";
			}
			else{
			System.out.println("No es correcta esa opcion.");
			}
			
			contadorMapa++;
			if(contadorMinas>2){
				haTerminado=0;
				System.out.println("Has perdido");
			}
			else if(contadorMapa>=31){
				System.out.println("Felicidades Ganador!");
				haTerminado=0;
			}
			else{
				
			}
		}
	}	
		
		
}