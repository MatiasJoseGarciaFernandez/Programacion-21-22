import java.util.Scanner;
public class ejercicio12U3 {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
		  examen de la asignatura Programación para obtener la media deseada. Hay
		  que tener en cuenta que la nota del primer examen cuenta el 40% y la del
		  segundo examen un 60%*/
		System.out.print("Cuanto has sacado en el primer examen de programacion? ");
		double nota1= entrada.nextDouble();
		System.out.print("cuanto quieres sacar en total? ");
		double notaF= entrada.nextDouble();
		
		double nota2= (notaF - nota1*0.4)/0.6;
		
		System.out.println("Debes sacar en el segundo examen un " +nota2);
	}
}
