import funcionesU8.FunMatem;
//Muestra los n�meros capic�a que hay entre 1 y 99999
public class ejercicio16U8 {
	public static void main(String[]args) {
		for(int i=0; i<=99999; i++) {
			if(FunMatem.esCapicua(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
