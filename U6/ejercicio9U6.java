/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
public class ejercicio9U6 {
	public static void main(String[]args) {
	
		System.out.println("Este programa muestra los numeros pares entre 0 y 100 hasta que salga el 24");
		int n=0;
		int contador=0;
		do {
			
			n=(int)(Math.random()*100);
			if(n%2==0) {
				System.out.print(n+" ");
				contador++;
			}
			
			
		}while (n!=24);
		
		System.out.println("\nHa salido un total de " +contador+ " numeros");
	}
}
