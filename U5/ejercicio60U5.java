/*Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.*/
import java.util.Scanner;
public class ejercicio60U5 {
  public static void main(String[] args) {
	  Scanner x = new Scanner(System.in);
	  
	  System.out.print("introduce la altura del calcetin: ");
	  int a = x.nextInt();
	  
	  for(int i=1; i<=a-2;i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	  for(int i=1; i<=2;i++) {
			for(int j=1; j<=6; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
	  
  
  }
}
