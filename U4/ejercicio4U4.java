/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.*/
import java.util.Scanner;
public class ejercicio4U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.print("¿Cuantas horas has trabajado esta semana? ");
		int horas= x.nextInt();
		
		if (horas <=40) {
			System.out.println("Esta semana deberias cobrar un total de " +horas*12+ "€ brutos");
		} 
		if (horas >40){
			int sueldo= ((horas - 40) * 16)+480;

			System.out.println("Esta semana deberias cobrar un total de " +sueldo+ "€ brutos por las horas extras");
		}
	}
}
