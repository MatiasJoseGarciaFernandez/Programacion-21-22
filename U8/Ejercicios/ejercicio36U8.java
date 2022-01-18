import static funcionesU8.FunMatem.esPrimo;
import static funcionesU8.ArrayUni.generaArrayInt;
import static funcionesU8.ArrayBid.muestraArrayUni;
public class ejercicio36U8 {
	public static void main(String[]args) {
		int [] numeros = generaArrayInt(5,1,3);
		System.out.print("Array completo: ");
		muestraArrayUni(numeros);
		System.out.print("\nArray de solo primos: ");
		muestraArrayUni(filtraPrimos(numeros));
	}
	
	/*Utiliza esta funci�n en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte m�s f�cil, las repeticiones de primos se conservan; es
decir, si en el array x el n�mero 13 se repite 3 veces, en el array devuelto
tambi�n estar� repetido 3 veces. Si no existe ning�n n�mero primo en x, se
devuelve un array con el n�mero -1 como �nico elemento.*/
	public static int[] filtraPrimos(int x[]) {
		int cuentaPrimos=0;
		int [] primos=new int[x.length];
		
		for(int n:x) {
			if(esPrimo(n)) {
				primos[cuentaPrimos++]=n;
			}
		}
		
		int[] result = new int[cuentaPrimos];
		
		for(int i=0; i<cuentaPrimos; i++) {
			result[i]=primos[i];
		}		
		return result;
	}
	
}
