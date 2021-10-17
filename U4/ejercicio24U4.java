/*Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.*/
import java.util.Scanner;
public class ejercicio24U4 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("este programa calcula el sueldo de un programador");
		System.out.println("1 - Programador junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de proyecto");
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		int cargo= x.nextInt();
		
		int sueldo=0;
		
		switch (cargo) {
			case 1:
				sueldo=950;
				break;
			case 2:
				sueldo=1200;
				break;
			case 3:
				sueldo=1600;
				break;
				default:
					System.out.print("Numero incorrecto");
		}
		
		System.out.print("Cuantos dias has estado de viaje? ");
		int dias= x.nextInt();
		int dietas= dias*30;
		
		System.out.print("introduce tu estado civil (1 - soltero, 2 - casado): ");
		int EstadoCivil= x.nextInt();
		int IRPF=0;
		
		if(EstadoCivil==1) {
			IRPF=25;
		}
		if(EstadoCivil==2) {
			IRPF=20;
		}
		
		int descuento= (sueldo+dietas)*IRPF/100;
		
		System.out.printf("-----------------------------------\n");
		System.out.printf("| Sueldo base %21d|\n", sueldo);
		System.out.printf("| Dietas ("+dias+"viajes) %16d|\n", dietas);
		System.out.printf("|----------------------------------|\n");
		System.out.printf("| Sueldo bruto %20d|\n", sueldo+dietas);
		System.out.printf("| Retencion IRPF ("+IRPF+") %13d|\n", descuento);
		System.out.printf("|----------------------------------|\n");
		System.out.printf("| Sueldo neto %21d|\n", (sueldo+dietas)-descuento);
		System.out.printf("-----------------------------------\n");
	}
}
