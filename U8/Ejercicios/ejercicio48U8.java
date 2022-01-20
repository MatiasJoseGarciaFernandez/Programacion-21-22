
public class ejercicio48U8 {
	public static void main(String[]args) {
		int [] array1= {6,3,8,1,9,2,1};
		int [] array2= {9,8,2,3};
		
		
		
		for(int fusion:concatena(array1,array2)) {
			System.out.print(fusion);
		}
	}
	
	
	public static int[] concatena(int[] a, int[] b) {
		int[] resultado=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			resultado[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			resultado[i+a.length]=b[i];
		}
		return resultado;
	}
}
