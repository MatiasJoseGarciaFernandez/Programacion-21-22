/*Implementa un programa que calcule la denominaci�n ordinal de los reyes de
una secuencia hist�rica. El programa solicitar� la cantidad de reyes que se
van a introducir, y a continuaci�n recibir� los nombres de los reyes. Presentar�
por pantalla dichos nombres, pero coloc�ndoles el ordinal correspondiente. As�,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero deber�a
aparecer como Felipe 1� y el segundo como Felipe 2�.*/
import java.util.Scanner;
public class ejercicio20U7 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de reyes que va a introducir: ");
		int cant = x.nextInt();
		
		String [] reyes = new String[cant];
		
		for(int i=0; i<cant; i++) {
			System.out.print("Vaya introduciendo Reyes, le quedan "+(cant-i)+ ": ");
			reyes[i]=x.next();
		}
		for (int i = 0; i < cant; i++) {
			int orden = 1;
			for (int j = 0; j < i; j++) {
				if (reyes[i].equals(reyes[j])) {
					orden++;
				}
			}
		
			System.out.println(reyes[i] + " " + orden + "�");
		}

	}
}
