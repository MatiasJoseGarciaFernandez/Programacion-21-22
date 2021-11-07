/*Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.*/
import java.util.Scanner;
public class ejercicio61U5 {
  public static void main(String[] args) {
	  Scanner x = new Scanner(System.in);
	
	  int a;
	  do {
		System.out.print("introduce la altura de la V(tiene que ser mayor o igual a 3): ");
		a = x.nextInt();
		if (a<3){
			System.out.println("Debes poner una altura mayor o igual a 3");
		}
	  }while(a<3);
	  
	  for(int i = 1; i <= a; i++){
	      for(int m = 1; m < i; m++){
	    	  System.out.print(" ");
	      }
	      for(int j = 1; j <= 3; j++){
	    	  System.out.print("*");
	      }
	      for(int k = 2*(a); k > i+i; k--){
	    	  System.out.print(" ");
	      }
	      for(int l = 1; l <= 3; l++){
	    	  System.out.print("*");
	      }
	      System.out.println("");
	  }
  }
}
