import java.util.Scanner;
public class ejercicioExtraU3 {
	public static void main(String[]args) {
		/*Escriba un programa que sea capaz de memorizar 5 frases, introducidas cada 
		 * una de ellas por teclado.
		 * El programa sólo puede utilizar una variable de tipo String. El programa 
		 * debe solicitar cada una de las 5 frases, y debe presentarlas todas juntas 
		 * tras la introducción de la quinta frase.
		 * Debe pensar en los pasos (algoritmo) que debe realizar el programa, 
		 * teniendo en cuenta la restricción de que sólo se puede usar una variable de 
		 * tipo String.*/
		Scanner x = new Scanner(System.in);
		String frase= "";

		System.out.println("introduce 5 frases con sentido: ");
		for(int i=1; i<=5; i++) {
			System.out.print("introduce la " +i+ "º frase: ");
			frase= frase+" "+x.nextLine();			
			if(i==5) {
				System.out.println(frase+ " es lo que has escrito" );
			}
		}	
	}
}
