import java.util.Scanner;
public class ejercicio2U3 {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("cuantas euros quieres pasar a peseta? ");
		double euros= entrada.nextDouble();
		double pesetas= 166.386;
		System.out.print(euros+ " euros son un total de " +euros*pesetas+ " pesetas");
	}
}
