public class ejercicio8U2 {
	public static void main(String[]args) {
		/*Escribe un programa que declare 5 variables de tipo char. A continuación, crea
		  otra variable como cadena de caracteres y asígnale como valor la concatenación 
		  de las anteriores 5 variables. Por último, muestra la cadena de caracteres
		  por pantalla¿Qué problemas te encuentras? ¿cómo lo has solucionado?*/
		char letra1='a';
		char letra2='b';
		char letra3='c';
		char letra4='d';
		char letra5='e';
		
		String frase="" + letra1 + letra2 + letra3 + letra4 + letra5;
		
		System.out.print(frase);
	}
}
