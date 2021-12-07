/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.*/
public class ejercicio4BidU7 {
	public static void main(String[]args) 
			throws InterruptedException {
		
		int [][] n = new int [4][5];
		int sumacol=0;
		int sumafil=0;
		int sumatot=0;
		
		for(int i=0; i<4; i++) {
			sumafil=0;
			for(int j=0; j<5; j++) {
				n[i][j]=(int)(Math.random()*900)+100;
				System.out.printf("%5d", n[i][j]);
				sumafil+=n[i][j];
				Thread.sleep(100);
				
			}
			System.out.printf("|%5d\n", sumafil);
			Thread.sleep(1000);
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
			Thread.sleep(1000);
			}
		System.out.printf("|%5d ", sumatot);
		

	}
}
