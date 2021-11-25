/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.*/
public class ejercicio2BidU7 {
	public static void main(String[]args) {
		
		int [][] n = new int [4][5];
		int sumacol=0;
		int sumafil=0;
		int sumatot=0;
		
		for(int i=0; i<4; i++) {
			sumafil=0;
			for(int j=0; j<5; j++) {
				n[i][j]=(int)(Math.random()*20);
				System.out.printf("%5d", n[i][j]);
				sumafil+=n[i][j];
			}
			System.out.printf("|%5d\n", sumafil);
		}
		for(int i = 0; i < 2; i++) {
			System.out.print("----------");
		}
		System.out.println("-----------");
		for(int i = 0; i < 5; i++) {
			sumacol = 0;
			for(int j = 0; j< 4; j++) {
				sumacol += n[j][i];
			}
			sumatot += sumacol;
			System.out.printf("%4d ", sumacol);
			}
			System.out.printf("|%5d ", sumatot);

	}
}
