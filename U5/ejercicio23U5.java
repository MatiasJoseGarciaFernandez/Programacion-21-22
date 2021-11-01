/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/
import java.util.Scanner;
public class ejercicio23U5 {
  public static void main(String[] args) {
	  Scanner x = new Scanner(System.in);
	  
	  int n;
	  int suma=0;
	  int contador=0;
	  do {
		  
		  System.out.print("Introduce un numero para ir sumandolo: ");
		  n = x.nextInt();
		  suma+= n;
		  contador++;
		  System.out.println("llevas: " +suma);
		  
	  } while (suma<=10000);
	  
	  System.out.println("Has introducido " +contador+ " numeros");
	  System.out.println("La media es: " +suma/contador);
  }
}
