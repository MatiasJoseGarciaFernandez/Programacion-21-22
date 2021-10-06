/*Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.*/
import java.util.Scanner;
public class ejercicio11U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa calcula cuanto tiempo queda para la medianoche");
		System.out.print("dame la hora: ");
		int hora= x.nextInt();
		System.out.print("dame los minutos: ");
		int minutos= x.nextInt();
		
		//variable con el total de segundos que tiene un día y otra con el total de tiempo en segundos introducido por el usuario
		
		
		int medianoche= 86400;
		int tiempoTotal= ( ( hora * 60 ) * 60 + (minutos * 60) );
		int resultado= medianoche - tiempoTotal;
		
		System.out.print("queda un total de " +resultado+ " segundos para la medianoche");
		
	}
}
