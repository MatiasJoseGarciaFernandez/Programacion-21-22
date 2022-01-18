import static funcionesU8.ArrayBid.muestraArrayUni;
import static funcionesU8.ArrayUni.generaArrayInt;
import static funcionesU8.FunMatem.posicionDeDigito;
public class ejercicio40U8 {
	public static void main(String[]args) {
		int [] numeros = generaArrayInt(20,0,1000);
		System.out.print("Array completo: ");
		muestraArrayUni(numeros);
		System.out.print("\nArray de solo sietes: ");
		muestraArrayUni(filtraCon7(numeros));
	}
	

	public static int[] filtraCon7(int x[]) {
		int[] sietes= new int[x.length];
		
		int cuenta7=0;
		for(int n:x) {
			if(contieneEl7(n)) {
				sietes[cuenta7++]=n;
			}
		}
		int result[]=new int[cuenta7];
		
		for(int i=0; i<cuenta7; i++) {
			result[i]=sietes[i];
		}
		return result;
	}
	
	public static boolean contieneEl7(int n) {
		return posicionDeDigito(n, 7) != -1;
	}
		public static boolean contieneEl7(long n) {
		return posicionDeDigito(n, 7) != -1;
	}
}
