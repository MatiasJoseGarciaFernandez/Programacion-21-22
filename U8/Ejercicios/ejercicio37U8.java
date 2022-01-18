import static funcionesU8.FunMatem.digitos;
import static funcionesU8.FunMatem.digitoN;
public class ejercicio37U8 {
	public static void main(String[]args) {
		int num = 1234567890;
		
		System.out.println("El " + num + " en morse se ve asi: " + convierteEnMorse(num));
			
		
	}
	
	/*Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
*/
	public static String convierteEnMorse(int n) {
		String[] morse = {" _ _ _ _ _ ", " . _ _ _ _ ", " . . _ _ _ ", " . . . _ _ ", " . . . . _ ",
				" . . . . . ", " _ . . . . ", " _ _ . . . ", " _ _ _ . . ", " _ _ _ _ . "};
		String resultado = "";
		for(int i = 0; i < digitos(n); i++) {
			resultado += morse[digitoN(n, i)];
		}
		return resultado;
	}
}
