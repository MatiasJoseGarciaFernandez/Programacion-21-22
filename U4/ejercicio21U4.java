/*Calcula la nota de un trimestre de la asignatura Programaci�n. El programa
pedir� las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un n�mero mayor o igual a 5, el alumno
est� aprobado y se mostrar� la media. En caso de que la media sea un n�mero
menor que 5, el alumno habr� tenido que hacer el examen de recuperaci�n que
se califica como apto o no apto, por tanto se debe preguntar al usuario �Cu�l
ha sido el resultado de la recuperaci�n? (apto/no apto). Si el resultado
de la recuperaci�n es apto, la nota ser� un 5; en caso contrario, se mantiene
la nota media anterior.*/
import java.util.Scanner;
public class ejercicio21U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Cuanto has sacado en el primer examen: ");
		double n1 = x.nextDouble();
		System.out.print("Cuanto has sacado en el segundo examen: ");
		double n2 = x.nextDouble();
		
		double nF= (n1+n2)/2;
		
		if(nF>=5) {
			System.out.print("Has sacado un " +nF);
		}
		if(nF<5) {
			System.out.print("�Has aprobado la recuperacion?(apto/no apto): ");
			String recu= x.next();
			if(recu.equals("apto")) {
				System.out.print("has sacado un 5");
			}else{
				System.out.print("has sacado un " +nF);
			}
		}
	}
}
