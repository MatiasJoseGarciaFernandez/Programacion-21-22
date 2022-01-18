import static funcionesU8.FunMatem.digitos;
import static funcionesU8.FunMatem.digitoN;
public class ejercicio39U8 {
	public static void main(String[]args) {
		int num = 387;
		
		System.out.println("El " + num + " en palabras se ve asi: " + convierteEnPalabras(num));
			
		
	}
	
	/*Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
*/
	public static String convierteEnPalabras(int n) {
		String[] morse = {"cero ", "uno ", "dos", "tres ", "cuatro ",
				"cinco ", "seis ", "siete ", "ocho ", "nueve "};
		String resultado = "";
		for(int i = 0; i < digitos(n); i++) {
			resultado += morse[digitoN(n, i)];
		}
		return resultado;
	}
}