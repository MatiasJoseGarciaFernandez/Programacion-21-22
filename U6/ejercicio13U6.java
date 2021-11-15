/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/
public class ejercicio13U6 {
	public static void main(String[]args) {
		
		int d1=0;
		int d2=0;
		
		do {
			d1 =(int)(Math.random()*6)+1;
			d2 =(int)(Math.random()*6)+1;
			
			System.out.print(d1+" "+ d2+" | ");
			
		}while (d1!=d2);
	}
}
