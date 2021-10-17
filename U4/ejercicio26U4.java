/*Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).*/
import java.util.Scanner;
public class ejercicio26U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Venta de entradas CineCampa");
		System.out.print("Número de entradas: ");
		int entradas= x.nextInt();
		System.out.print("Día de la semana: ");
		String dia = x.next();
		
		float precio=0;
		String entrada="";
		String frase="";
		
		if((entradas%2!=0) || (dia.equals("jueves"))) {
			entradas= entradas - 1;
		}
		
		switch (dia) {
			case "miercoles":
				frase="Entradas individuales";
				entrada="Precio por entrada individual";
				precio=5;
				break;
			case "jueves":
				frase="Entradas de parejas";
				entrada="Precio por entrada de pareja";
				precio=11;
				entradas= entradas/2;
				break;
			default:
				frase="Entradas individuales";
				entrada="Precio por entrada individual";
				precio=8;
		}
		
		
		System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
		String tarjeta= x.next();
		
		int descuento=0;
		
		if (tarjeta.equals("s")) {
			descuento= 10;
		}
		if (tarjeta.equals("n")) {
			descuento= 0;
		}
		
		float precioSD= precio*entradas;
		float precioCD= (precioSD*descuento)/100;
		float total= precioSD-precioCD;
		
		System.out.println("Aquí tiene sus entradas. Gracias por su compra");
		System.out.printf("%s: %13d\n", frase, entradas);
		System.out.printf("%s: %6.2f\n", entrada, precio);
		if ((entradas%2!=0) || (dia.equals("jueves"))) {
			System.out.printf("Entradas individuales: %11d\n" ,1);
			System.out.printf("Precio por entrada individual %7.2f\n",8.00);
			precioSD=precioSD+8;
			precioCD=(precioSD*descuento)/100;
			total= precioSD-precioCD;
		}
		System.out.printf("Total: %30.2f\n", precioSD);
		System.out.printf("Descuento: %26.2f\n", precioCD);
		System.out.printf("A pagar: %28.2f\n", total);
		
	}
}