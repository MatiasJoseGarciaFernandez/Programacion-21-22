/*Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra tambi�n el m�ximo, el m�nimo y la media
de esos n�meros.*/
public class ejercicio5U6 {
	public static void main(String[]args) {
		
		int maximo=100;
		int minimo=199;
		int suma=0;
		int contador=0;
		
		for(int i=0; i<50; i++) {
			int n = (int)(Math.random()*100)+100;
			
			System.out.print(n+" ");
			
			contador++;
			suma+=n;
			
			if(n>maximo) {
				maximo = n;
			}
			if(n<minimo) {
				minimo=n;
			}
		}
		double media = suma/contador;
		
		System.out.println("\nEl maximo es "+maximo+" y el minimo "+minimo);
		System.out.println("La media de los numeros es: " +media);
	}
}
