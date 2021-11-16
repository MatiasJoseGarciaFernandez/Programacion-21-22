/*Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?*/
public class ejercicio2U6 {
	public static void main(String[]args) {
		char [] con= new char[10];
		con[0]='a';
		con[1]='x';
		con[4]='@';
		con[6]='"';
		con[7]='+';
		con[8]='Q';
		
		System.out.print("Indice");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", i);
		}
		System.out.print("\nValor ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4s", con[i]);
		}
	}
}
