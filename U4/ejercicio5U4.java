/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).*/
import java.util.Scanner;
public class ejercicio5U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa resuelve ecuaciones de primer grado tipo ax+b=0");
		System.out.print("Introduce el valor de a: ");
		double a= x.nextDouble();
		System.out.print("introduce el valor de b: ");
		double b= x.nextDouble();
		
		double solucion= -b/a;
		
		if(a==0) {
			System.out.print("La ecuacion no tiene solucion, no se puede dividir entre 0");
		} else {
			System.out.print("La solucion de la ecuacion es: " +solucion);
		}
	}
}
