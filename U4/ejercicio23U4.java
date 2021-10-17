/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/
import java.util.Scanner;
public class ejercicio23U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa calcula el precio final de un producto");
		System.out.print("Intoduzca la base imponible: ");
		double base = x.nextInt();
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String IVA = x.next();
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String promocion = x.next();
		
		int tipoIVA=0;
		double promoAplicada=0;
		
		switch(IVA) {
		case "general":
			tipoIVA=21;
			break;
		case "reducido":
			tipoIVA=10;
			break;
		case "superreducido":
			tipoIVA=4;
			break;
			default:
				System.out.print("tipo de IVA mal introducido");
		}
		double IVAaplicado= base * tipoIVA/100;
		double TotalProducto= base + IVAaplicado;
		
		switch(promocion) {
		case "nopro":
			break;
		case "mitad":	
			promoAplicada= TotalProducto/2;
			break;
		case "meno5":
			promoAplicada= 5;
			break;
		case "5porc":
			promoAplicada= TotalProducto*0.05;
			break;
			default:
				System.out.print("promocion no valida");
		}
		double total = TotalProducto - promoAplicada;
		
		System.out.println("base imponible "+base);
		System.out.println("IVA ("+tipoIVA+"%) "+ IVAaplicado);
		System.out.println("precio con IVA " +TotalProducto);
		System.out.println("Cod.promo. ("+promocion+") " +promoAplicada );
		System.out.println("TOTAL: "+ total);	
		
	}
}
