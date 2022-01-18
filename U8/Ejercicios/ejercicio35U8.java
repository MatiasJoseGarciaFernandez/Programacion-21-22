import static funcionesU8.FunMatem.digitos;
import static funcionesU8.FunMatem.digitoN;

public class ejercicio35U8 {
	public static void main(String[]args) {
		int[] num = {492,592, 921, 300};
		for (int n : num) {
			System.out.println("El " + n + " en el sistema de palotes: " + convierteEnPalotes(n));
			
		}
	}
	
	
	/*Esta función convierte el número n al sistema de palotes y lo devuelve en una
	cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
	| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa	
	para comprobar que funciona bien. Desde la función no se debe mostrar nada
	por pantalla, solo se debe usar print desde el programa principal.*/
	public static String convierteEnPalotes(int n) {
		String resultado="";
		
		for(int i=0; i<digitos(n); i++) {
			for(int j=0; j< digitoN(n, i);j++) {
				resultado +="|";
			}
			if(i<digitos(n)-1) {
				resultado +="-";
			}
		}
		
		return resultado;		
	}
}
