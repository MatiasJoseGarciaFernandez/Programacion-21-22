/*Modifica el programa anterior de tal forma que no se repita ningún número en
el array*/
public class ejercicio6BidU7 {
public static void main(String[]args) {
		
		int maximo=Integer.MIN_VALUE;
		int minimo=Integer.MAX_VALUE;
		int [][] n = new int [6][10];
		int minFil=0;
		int minCol=0;
		int maxFil=0;
		int maxCol=0;
		boolean repetido;
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				do {
					n[i][j]=(int)(Math.random()*1000);
					repetido=false;
					for (int k = 0; k < 10 * i + j; k++) {
						if (n[i][j] == n[k / 10][k % 10]) {
						repetido = true;
						}
					}
				}while(repetido);
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%6d",n[i][j]);
					
				if(n[i][j]<minimo) {
					minimo= n[i][j];
					minFil=i;
					minCol=j;
					
				}
				if(n[i][j]>maximo) {
					maximo= n[i][j];
					maxFil=i;
					maxCol=j;
				}
			}
			System.out.println();
		}
		
		System.out.println("\nEl maximo es "+maximo+ " y se encuentra en la posicion " +(maxFil+1)+ ", "+(1+maxCol));
		System.out.println("El minimo es " +minimo+ " y se encuentra en la posicion " +(minFil+1)+ ", "+(1+minCol));
	}
}
