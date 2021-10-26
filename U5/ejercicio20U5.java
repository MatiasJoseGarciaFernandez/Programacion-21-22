import java.util.Scanner;
public class ejercicio20U5 {
  public static void main(String[] args) {
	  Scanner x = new Scanner(System.in);
	  int a;
	  String caracter;
   
	  System.out.print("dame la altura de la piramide: ");
	  a= x.nextInt();
	  System.out.print("introduce caracter: ");
	  caracter=  x.next();

    for(int i=1;i<=a; i++) {
      for(int j=1; j<=a-i; j++) {
        System.out.print(" ");
        
      }
      for(int k=1; k<=(i*2)-1; k++){
        if( k==1 || k==(i*2)-1 || i==a) {
          System.out.print(caracter);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
      
    }
  }
}


