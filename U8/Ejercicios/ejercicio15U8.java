import funcionesU8.FunMatem;
//Muestra los números primos que hay entre 1 y 1000
public class ejercicio15U8 {
	public static void main(String[]args) {
		for(int i=0; i<1001; i++) {
			if(FunMatem.esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
