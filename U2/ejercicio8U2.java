public class ejercicio8U2 {
	public static void main(String[]args) {
		/*Escribe un programa que declare 5 variables de tipo char. A continuaci�n, crea
		  otra variable como cadena de caracteres y as�gnale como valor la concatenaci�n 
		  de las anteriores 5 variables. Por �ltimo, muestra la cadena de caracteres
		  por pantalla �Qu� problemas te encuentras? �c�mo lo has solucionado?*/
		char letra1='a';
		char letra2='b';
		char letra3='c';
		char letra4='d';
		char letra5='e';
		
		String frase="" + letra1 + letra2 + letra3 + letra4 + letra5;
		
		System.out.print(frase);
	}
}
