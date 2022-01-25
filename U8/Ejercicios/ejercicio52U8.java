
public class ejercicio52U8 {
	public static void main(String[] args) {
		int[] a = {45, 432, 13, 4};
		int[] b = {5431, 123, 543, 5};
		System.out.println(aleatorioDeArray(a));
		System.out.println(aleatorioDeArray(b));
	}
	
	public static int aleatorioDeArray(int[] a) {
		return a[(int)(Math.random() * a.length)];
	}
}
