/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

public class ejercicio1U6 {
	public static void main(String[]args) {
		System.out.println("Este programa muestra la suma de la tirada de tres dados");
		
		int suma=0;
		
		for(int i=0; i<3; i++) {
			int dados= (int)(Math.random()*6)+1;
			System.out.print(dados+ " ");
			suma+= dados;
		}
		System.out.println("\nLa suma de los dados es: "+suma);
	}
}
