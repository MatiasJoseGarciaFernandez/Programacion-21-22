/*Realiza un programa que pinte por pantalla diez l�neas formadas por caracteres.
El car�cter con el que se pinta cada l�nea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las l�neas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/
public class ejercicio10U6 {
	public static void main(String[]args) {
		
		for(int i=0; i<10; i++) {
			
			int longitud=(int)(Math.random()*40)+1;
			int caracter=(int)(Math.random()*6)+1;
			String c="";
			
			switch(caracter) {
				case 1:
					c="*";
					break;
				case 2:
					c="-";
					break;
				case 3:
					c="=";
					break;
				case 4:
					c=".";
					break;
				case 5:
					c="|";
					break;
				case 6:
					c="@";
					break;
					default:
			}
			
			for(int j=0; j<longitud; j++) {
				System.out.print(c);
			}
			System.out.println();
			
		}
		
	}
}
