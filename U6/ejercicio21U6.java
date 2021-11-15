/*Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.*/
public class ejercicio21U6 {
	public static void main(String[]args) {
		
		String l="";
		String m="";
		for(int i=0; i<5; i++) {
			int lado=(int)(Math.random()*2)+1;
			switch(lado) {
				case 1:
					l="cara";
					break;
				case 2:
					l="cruz";
					break;
					default:
			}
			int moneda=(int)(Math.random()*8)+1;
			
			switch(moneda) {
				case 1:
					m="1 centimo - ";
					break;
				case 2:
					m="2 centimos - ";
					break;
				case 3:
					m="5 centimos - ";
					break;
				case 4:
					m="10 centimos - ";
					break;
				case 5:
					m="20 centimos - ";
					break;
				case 6:
					m="50 centimos - ";
					break;
				case 7:
					m="1 euro - ";
					break;
				case 8:
					m="2 euros - ";
					break;
					default:
			}
			System.out.println(m+ l);
		}
	}
}
