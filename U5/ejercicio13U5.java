/*Escribe un programa que lea una lista de diez n�meros y determine cu�ntos
son positivos, y cu�ntos son negativos.*/
import java.util.Scanner;
public class ejercicio13U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("este programa lista cuando numeros son positivos y cuantos negativos");
		int n;
		int cuentapo=0;
		int cuentane=0;
		for(int i=0; i<10; i++) {
			System.out.print("Pon un numero: ");
			n = x.nextInt();
			if (n>=0) {
				cuentapo++;
			} else {
				cuentane++;
			}
		}
		System.out.println("Hay un total de " +cuentapo+ " nuemors positivos y " +cuentane+ " numeros negativos");
	}
}
