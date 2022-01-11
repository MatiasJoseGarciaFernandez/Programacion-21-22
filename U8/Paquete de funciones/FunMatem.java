package funcionesU8;

public class FunMatem {	

	//EJERCICIO 1
	public static boolean esCapicua(long x) {
		return x==voltea(x);
	}
	
	//EJERCICIO 2
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	//EJERCICIO 3
	public static int siguientePrimo(int x) {
		while (!esPrimo(++x)) {};
		return x;
	}
	
	//EJERCICIO 4
	public static int potencia(int b, int e) {
		int resultado=1;
				
		if (e == 0) {
			return 1;
		}
		if (e < 0) {
			return 1/potencia(b, -e);
		}
		
		for(int i=0; i< Math.abs(e); i++) {
			resultado=resultado*b;
		}
		
		return resultado;
	}
	
	//EJERCICIO 5
	public static int digitos(long x) {
		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10;
				n++;
			}
		return n;
		}
	}
	
	//EJERCICIO 6     
	public static long voltea(long x){
		long inverso = 0;
		while(x>0){
			inverso = (inverso * 10)+(x % 10); 
			x /= 10;
		}
		return inverso;
	}
	
	//EJERCICIO 7
	public static int digitoN(long x, int n) {
		x = voltea(x);
		while (n-- > 0) {
			x = x / 10;
		}
		return (int)x % 10;
	}
	
	//EJERCICIO 8
	public static int posicionDeDigito(long x, int d) {
		int i=0;
		for(i=0;  (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
			if (i == digitos(x)) {
				return -1;
			} else {
				return i;
			}
	}
	
	//EJERCICIO 9
	public static long quitaPorDetras(long x, int n) {
		return x / (long)potencia(10, n);
	}

	//EJERCICIO 10
	public static long quitaPorDelante(long x, int n) {
		x = pegaPorDetras(x, 1); 
		x = voltea(quitaPorDetras(voltea(x), n));
		x = quitaPorDetras(x, 1);
		return x;
	}
	
	//EJERCICIO 11
	public static long pegaPorDetras(long x, int d) {
		return juntaNumeros(x, d);
	}

	//EJERCICIO 12
	public static int pegaPorDelante(int x, int d) {
		return (int)pegaPorDelante(x, d);
	}

	//EJERCICIO 13
	public static long trozoDeNumero(long x, int inicio, int fin) {
		int longitud = digitos(x);
		x = quitaPorDelante(x, inicio);
		x = quitaPorDetras(x, longitud - fin - 1);
		return x;
	}
	
	//EJERCICIO14
	public static long juntaNumeros(long x, long y) {
		return (long)(x * potencia(10, digitos(y))) + y;
	}

}

