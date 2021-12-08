/*Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).*/
public class ejercicio13BidU7 {
	public static void main(String[]args) {
		final int fila=4;
		final int columna = 10;
		String [] paises = { "España", "Rusia", "Japón", "Australia"};
		int[][] n= new int[fila][columna];
		
		
		
		
		System.out.printf("%77s", "MED  MIN  MAX");
		System.out.println();
	
		for(int i=0; i<fila; i++) {
			int maximo=140;
			int minimo=210;
			int suma=0;
			
			System.out.printf("%9s: ",paises[i]);
			for(int j=0; j<columna; j++) {
				n[i][j]= (int)(Math.random()*71)+140;
				System.out.printf("%5d", n[i][j]);
				if(n[i][j]>maximo) {
					maximo=n[i][j];
				}
				if(n[i][j]<minimo) {
					minimo=n[i][j];
				}
				suma+=n[i][j];
			}

		
			System.out.printf("|%5d%5d%5d", suma/10, minimo, maximo);
			
			System.out.println();
		}

	}
}
