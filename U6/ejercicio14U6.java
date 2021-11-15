/*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.*/
import java.util.Scanner;
public class ejercicio14U6 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		int num=0;
		int oportunidades=5;
		int n;
		boolean acierto=false;
		
		String respuesta="";
		String res="";
		
		int maximo=100;
		int minimo=0;
		
		do {
			
			num=(int)(Math.random()*(maximo-minimo))+minimo;
			System.out.print("Me quedan "+oportunidades+ " intentos, el numero es el " +num+ "? ");
			respuesta=x.next();
			
			if(respuesta.equals("si")) {
				acierto=true;
				System.out.println("He ganado :D");
			}
			if(respuesta.equals("no")) {
				oportunidades--;
				System.out.print("El numero es mas pequeño o mas grande (mayor o menor): ");
				res=x.next();
				if(res.equals("mayor")) {
					minimo=num;
				}
				if(res.equals("menor")) {
					maximo=num;
				}
			
			}
			if(oportunidades==0) {
				System.out.println("Me quede sin intentos ;(");
			}
			
		}while ((oportunidades>0) && (!acierto));
		
	}
}
