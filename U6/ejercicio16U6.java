/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.*/
public class ejercicio16U6 {
	public static void main(String[]args) {
		
		int figuras=0;
		
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		
		
		for(int i=0; i<3; i++) {
			figuras=(int)(Math.random()*5)+1;
			
						
			switch(figuras) {
				case 1:
					System.out.print("corazon ");
					break;
				case 2:
					System.out.print("diamante ");
					break;
				case 3:
					System.out.print("herradura ");
					break;
				case 4:
					System.out.print("campana ");
					break;
				case 5:
					System.out.print("limon ");
					break;
					default:
			}
			switch(i) {
				case 0:
					f1 = figuras;
					break;
				case 1:
					f2 = figuras;
					break;
				case 2:
					f3 = figuras;
					break;
					default:
			}
		}
		if ((f1 != f2) && (f2 != f3) && (f1 != f3)) {
			System.out.println("\nLo siento, ha perdido.");
		} else if ((f1 == f2) && (f2 == f3)) {
			System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
		} else {
			System.out.println("\nBien, ha recuperado su moneda.");
		}

	}
}
