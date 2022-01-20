import java.util.Scanner;
public class ejercicio42U8 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Introduce la altura de la piramide: ");
		int altura=x.nextInt();
		
		creaPiramideHueca(altura,'*');
	}
	
	public static int creaPiramideHueca(int x, char m) {
		
		for(int i=0; i<x; i++) {
			for(int j=x; j>i; j--) {
				if(j==i+1 || j==x || i==0) {
					System.out.print(m);
			    } else {
			        System.out.print(" ");
			    }
			}
			System.out.println();
		}
		return x;
	}
}
