/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/
import java.util.Scanner;
public class ejercicio6U6 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int num= (int)(Math.random()*100);
		System.out.println("Hemos generado un numero aleatorio entre el 0 y el 100 intenta adivinarlo");
		
		int oportunidades=5;
		int n;
		boolean acierto=false;
		
		do {
			
			System.out.print("Tienes "+oportunidades+ " intentos, cual numero crees que salio? ");
			n = x.nextInt();
			oportunidades--;
			
			if(n<num) {
				System.out.println("el numero generado es mas grande");
			}
			if(n>num) {
				System.out.println("el numero generado es mas pequeño");
			}
			
			if(oportunidades==0) {
				System.out.println("Te quedaste sin intentos, el numero era el " +num);
			}
			
			if(n==num) {
				acierto= true;
				System.out.println("enhorabuena acertaste!!!");
			}
			
		}while ((oportunidades>0) && (!acierto));
		
		
	}
}
