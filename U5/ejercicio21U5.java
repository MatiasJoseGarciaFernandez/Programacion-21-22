/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
import java.util.Scanner;
public class ejercicio21U5 {
  public static void main(String[] args) {
	  Scanner x = new Scanner(System.in);
	  
	  int n;
	  int contador=0;
	  int contadorIm=0;
	  int suma=0;
	  int mayorPar=0;
	  
	  do {
			System.out.print("introduce un numero (pon uno negativo para parar el bucle): ");
			n = x.nextInt();
			contador++;
			if(n%2==0) {
				if (n > mayorPar) {
					mayorPar = n;
				}

			} 
			if (n%2==1) {
				suma+= n;
				contadorIm++;
			}
			
		} while (n>0);
	  
	  double media= suma/contadorIm;
	  
	  System.out.println("Has introducido un total de "+(contador-1)+" numeros");
	  System.out.println("La media de los numeros impares es: " +media);
	  System.out.print("el numero " +mayorPar+ " es el par mas grande");
  }
}