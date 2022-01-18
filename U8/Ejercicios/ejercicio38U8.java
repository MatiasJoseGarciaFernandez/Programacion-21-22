import static funcionesU8.FunMatem.esCapicua;
import static funcionesU8.ArrayUni.generaArrayInt;
import static funcionesU8.ArrayBid.muestraArrayUni;
public class ejercicio38U8 {
	public static void main(String[]args) {
		int [] numeros = generaArrayInt(20,0,100);
		System.out.print("Array completo: ");
		muestraArrayUni(numeros);
		System.out.print("\nArray de solo capicuas: ");
		muestraArrayUni(filtraCapicuas(numeros));
	}
	

	public static int[] filtraCapicuas(int x[]) {
		int cuentaCapicuas=0;
		int [] capicuas=new int[x.length];
		
		for(int n:x) {
			if(esCapicua(n)) {
				capicuas[cuentaCapicuas++]=n;
			}
		}
		
		int[] result = new int[cuentaCapicuas];
		
		for(int i=0; i<cuentaCapicuas; i++) {
			result[i]=capicuas[i];
		}		
		return result;
	}
	
}
