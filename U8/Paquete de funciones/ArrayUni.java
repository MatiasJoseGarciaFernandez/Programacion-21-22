package funcionesU8;

public class ArrayUni {
		
	//EJERCICIO 1
	public static int[] generaArrayInt(int x, int minimo, int maximo){
		int [] n = new int[x];
		
		for(int i=0; i<x; i++) {
			n[i]= (int)(Math.random()*(maximo - minimo + 1))+minimo;
			
		}
		return n;
		
	}
	
	//EJERCICIO 2
	public static int minimoArrayInt(int[] x) {
		int minimo=Integer.MAX_VALUE;
		
		for(int n:x) {
			if(n<minimo) {
				minimo=n;
			}
		}
		return minimo;
	}
	
	//EJERCICIO 3
	public static int maximoArrayInt(int[] x) {
		int maximo=Integer.MIN_VALUE;
		
		for(int n:x) {
			if(n>maximo) {
				maximo=n;
			}
		}
		return maximo;
	}
	
	//EJERCICIO 4
	public static double mediaArrayInt(int[] x) {
		int suma=0;
		
		for(int n:x) {
			suma+=n;
		}
		
		return (double)suma/x.length;
	}
	
	//EJERCICIO 5
	public static boolean estaEnArrayInt(int[] x, int n) {
		for (int numero : x) {
			if (numero == n) {
				return true;
			}
		}
		return false;		
	}
	
	//EJERCICIO 6
	public static int posicionEnArrayInt(int[] x, int n) {
		for(int i = 0; i < x.length; i++) {
			if (x[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	//EJERCICIO 7
	public static int[] volteaArrayInt(int[] x) {
		int[] a = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			a[x.length - i - 1] = x[i];
		}
		return a;
	}
	
	//EJERCICIO 8
	public static int[] rotaDerechaArrayInt(int[] x, int n) {
		int[] a = x.clone(); // clona en a el contenido de x
		int i;
		int aux;
		while (n-- > 0) {
			aux = a[a.length - 1];
			for(i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
				System.out.print(a[i]+" ");
			}
			a[0] = aux;
		}
		return a;
	}

	//EJERCICIO 9
	public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
		int[] a = x.clone(); 
		int i;
		int aux;
		while (n-- > 0) {
			aux = a[0];
			for(i = 0; i < a.length - 1; i++) {		
				a[i] = a[i + 1];
				System.out.print(a[i]+" ");
			}
			a[a.length - 1] = aux;
		}
		return a;
	}

}
