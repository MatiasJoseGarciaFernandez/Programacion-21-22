package Ej1U9;

public class usoCaballo {
	public static void main(String[]args) {
		Caballo RazaSuprema= new Caballo("Marron", 15, "Augusto", 8 );
		
		System.out.println("Hola me llamo " + RazaSuprema.CogeNombre());
		
		RazaSuprema.cabalga();
		RazaSuprema.relincha();
		RazaSuprema.rumia();		
	}

}
