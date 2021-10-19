/*Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente*/
import java.util.Scanner;
public class ejercicio29U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Este programa pregunta que ha desayunado");
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		String comida = x.next();
		
		String pitufo= "";
		if (comida.equals("pitufo")) {
			System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
			pitufo = x.next();
		}
		
		System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
		String bebida = x.next();
		
		float precioComida=0;
		float precioBebida=0;
		
		switch (comida) {
		case "palmera":
			System.out.println("Palmera: 1,40€");
			precioComida = (float) 1.4;
			break;
		case "donut":
			System.out.println("Donut: 1,00€");
			precioComida = 1;
			break;
		case "aceite":
			System.out.print("Pitufo de aceite: 1,20€");
			precioComida= (float) 1.2;
			default:
				System.out.println("El pitufo que usted ha pedido es: ");
	}
		switch (pitufo) {
		case "aceite":
			System.out.println("Pitufo con aceite: 1,20€");
			precioComida = (float) 1.2;
			break;
		case "tortilla":
			System.out.println("Pitufo con tortilla: 1,60€");
			precioComida = (float) 1.6;
			break;
			default:
				System.out.println("No tenemos esos pitufos");
		}
		
		switch (bebida) {
			case "zumo":
				System.out.println("Zumo: 1,50€");
				precioBebida = (float) 1.5;
				break;
			case "cafe":
				System.out.println("Cafe: 1,20€");
				precioBebida = (float) 1.2;
				break;
				default:
					System.out.println("No tenemos eso");
		}
		float total = precioComida + precioBebida;
		System.out.println("Total desayuno: " +total+ "€");
		
	}
}
