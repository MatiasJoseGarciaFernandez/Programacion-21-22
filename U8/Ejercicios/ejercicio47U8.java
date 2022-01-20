
public class ejercicio47U8 {
	public static void main(String[]args) {
		int[]a= {8,5,3,7,5,6};
		System.out.print(convierteArrayEnString(a));
	}
	
	public static String convierteArrayEnString(int[]a) {
		String resultado="";
		
		for(int digitos:a) {
			resultado+=digitos;
		}
		return resultado;
	}
}
