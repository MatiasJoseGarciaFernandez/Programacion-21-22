package funcionesU8;

import funcionesU8.ArrayUni;
public class ArrayBid {
	
	//Muestra Array unidimensionales
	public static void muestraArrayUni(int x[]) {
		for (int i = 0; i < x.length; i++) {
		System.out.printf("%4d",x[i]);
		}
	}
	
	//Funciones para mostrar arrays bidimensionales
	public static int filasArrayIntBi(int x[][]) {
		return x.length;
	}
	
	public static int columnasArrayIntBi(int x[][]) {
		return x[0].length;
		}


	public static void muestraArrayBi(int x[][]) {
		for (int f = 0; f < filasArrayIntBi(x); f++) {
			for (int c = 0; c < columnasArrayIntBi(x); c++) {
				System.out.printf("%4d", x[f][c]);
			}
			System.out.println();
		}
	}

	//EJERCICIO 1
	public static int[][] generaArrayBiInt(int y, int z, int minimo, int maximo){
		int [][] n = new int[y][z];
		
		for(int i=0; i<y; i++) {
			for(int j=0; j<z; j++) {
				n[i][j]= (int)(Math.random()*(maximo - minimo + 1))+minimo;
				
			}
			System.out.println();
			
		}
		return n;
		
	}
	
	//EJERCICIO 2
	public static int[] filaDeArrayBiInt(int y[][], int fila ){
		int[] f = new int[y[0].length];
		for (int i = 0; i < y[0].length; i++) {
		f[i] = y[fila][i];
		}
		return f;
	}
	
	//EJERCICIO 3
	public static int[] columnaDeArrayBiInt(int x[][], int columna) {
		int[] c = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			c[i] = x[i][columna];
		}
		return c;
	}
	
	//EJERCICIO 4
	public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
		for (int fila = 0; fila < x.length; fila++) {
			for (int columna = 0; columna < x[0].length; columna++) {
				if (x[fila][columna] == n) {
					int[] coordenadas = {fila, columna};
					return coordenadas;
				}
			}
		}
		int[] coordenadas = {-1, -1};
		return coordenadas;
	}
	
	//EJERCICIO 5
	public static boolean esPuntoDeSilla(int x[][], int i, int j) {
		int[] fila = filaDeArrayBiInt(x, i);
		int[] columna = columnaDeArrayBiInt(x, j);
		
		return ((ArrayUni.minimoArrayInt(fila) == x[i][j])
		&& (ArrayUni.maximoArrayInt(columna) == x[i][j]));
	}
	
	//EJERCICIO 6
	public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
		int elementos = 0, i, j;
		int[] diagonalAux = new int [1000];
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[0].length; j++) {
				if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
					|| (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
						diagonalAux[elementos++] = x[i][j];
				}
			}
		}
		int[] diagonal = new int[elementos];
		for (j = 0; j < elementos; j++) {
			diagonal[j] = diagonalAux[j];
		}
	
		return diagonal;
	}
		
}
