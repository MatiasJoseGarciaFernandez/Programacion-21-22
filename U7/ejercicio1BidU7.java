/*Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.*/
public class ejercicio1BidU7 {
	public static void main(String[]args) {
		
		int [][] n = new int[3][5];
		n[0][0]=0;
		n[1][0]=75;
		n[0][1]=30;
		n[0][2]=2;
		n[0][4]=5;
		n[1][4]=0;
		n[2][2]=-2;
		n[2][3]=9;
		n[2][4]=11;
		
		for(int i=0; i<3; i++) {
			for(int j =0; j<5; j++) {
				System.out.printf("%4d",n[i][j]);
			}
			System.out.println();
		}
	}
}
