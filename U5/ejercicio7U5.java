/*Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�
y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/
import java.util.Scanner;
public class ejercicio7U5 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int i = 0;
		int combinacion;
		boolean acierto= false;
		
		do {
			System.out.print("Introduce la combinacion de la caja fuerte (4 digitos): ");
			combinacion = x.nextInt();
			if (combinacion == 1322) {
				acierto = true;
			} else {
				System.out.println("Clave incorrecta");
			}

			i++;
			
		} while((!acierto) && (i<4));
		
		if (acierto) {
			System.out.println("Abriste la caja fuerte");
		} else {
			System.out.println("Te quedaste sin oportunidades, prueba mas tarde");
		}
	}
}
