import java.util.Scanner;
public class ejercicio6U2 {
	public static void main (String[]args) {
		/*Escribe un programa que calcule el total de una factura a partir de la base
		  imponible (precio sin IVA). La base imponible estará almacenada en una
			variable.
		 */
		double producto;
		Scanner entrada=new Scanner(System.in);
		System.out.println("este programa calcula el precio base de un producto(sin IVA)");
		System.out.print("dame el precio de un producto: ");
		producto= entrada.nextDouble();
		double IVA= producto*0.21;
		double prodbase= producto - IVA;
		System.out.print("el precio de producto sin IVA es: " + prodbase );
	}
}
