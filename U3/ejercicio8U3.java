import java.util.Scanner;

public class ejercicio8U3 {
	public static void main(String[]args) {
		/*Escribe un programa que calcule el salario semanal de un empleado en base a
		  las horas trabajadas, a razón de 12 euros la hora.*/
		Scanner entrada=new Scanner(System.in);
		System.out.print("Cuantas horas ha trabajado este trabajador esta ultima semana? ");
		int horas= entrada.nextInt();
		
		System.out.println("esta semana ha ganado un total de " +horas*12+ "€ en bruto");
		
	}
}
