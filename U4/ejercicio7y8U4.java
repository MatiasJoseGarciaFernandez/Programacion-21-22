/*Realiza un programa que calcule la media de tres notas.
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
*/
import java.util.Scanner;
public class ejercicio7y8U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa calcula la media de 3 notas y dice si estas aprobado o no");
		System.out.print("¿cuanto has sacado en 1º examen? ");
		float n1 = x.nextFloat();
		System.out.print("¿cuanto has sacado en 2º examen? ");
		float n2 = x.nextFloat();
		System.out.print("¿cuanto has sacado en 3º examen? ");
		float n3 = x.nextFloat();
		
		float nf= (n1+n2+n3)/3;
		System.out.print("has sacado un " +nf+ " en total. ");
		if(nf<5) {
			System.out.print("Tienes un insuficiente");
		}
		if(nf==5) {
			System.out.print("Tienes un suficiente");
		}
		if((nf>5) && (nf<=8)) {
			System.out.print("Tienes un notable");
		}
		if((nf>8) && (nf<=10)) {
			System.out.print("Tienes un sobresaliente");
		}
	}
}
