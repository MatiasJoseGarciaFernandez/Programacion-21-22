/*Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/
public class ejercicio12BidU7 {
	public static void main(String[]args) {
		
		final int DIMENSION=9;
		int maximo=500;
		int minimo=900;
		int suma=0;
		
		int[][] n = new int [DIMENSION][DIMENSION];
		
		for(int i=0; i<DIMENSION; i++) {
			for(int j=0; j<DIMENSION; j++) {
				n[i][j]=(int)(Math.random()*401)+500;
				System.out.printf("%5d", n[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("Los numeros desde la esquina inferior izquierda hasta la esquina superior derecho :");
		for(int i=0; i<DIMENSION; i++) {
			int num = n[8-i][i];
			System.out.printf("%5d", num);
			suma+=num;
				
			if(num>maximo) {
				maximo=num;
			}
			if(num<minimo) {
				minimo=num;
			}
		}
		System.out.println("\nmaximo: " +maximo);
		System.out.println("minimo: " +minimo);
		System.out.println("media: " +suma/9);
	}
}
