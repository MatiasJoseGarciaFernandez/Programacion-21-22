import java.util.Scanner;

/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/
public class ejercicio16U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Este pograma dice si un numero es primo");
		int n;
		boolean esPrimo=true;
		String continuar;
		
		
		do {
			System.out.print("introduce un numero: ");
			n = x.nextInt();
			for (int i = 2; i < n; i++) {
				if ((n % i) == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				System.out.println("es primo.");
			} else {
				System.out.println("no es primo.");
			}
			System.out.print("¿Quieres continuar?(s/n) ");
			continuar = x.next();
		}while (continuar.equals("s"));
		System.out.print("Hasta luego.");
	}
}