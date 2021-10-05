import java.util.Scanner;
public class ejercicio3U3 {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("cuantas pesetas quieres pasar a euro? ");
		double pesetas= entrada.nextDouble();
		double euros= 0.006;
		System.out.println(pesetas+ " pesetas son un total de " +euros*pesetas+ " euros");
	}
}

