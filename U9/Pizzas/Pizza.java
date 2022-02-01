package Pizzas;

/*Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
siguiente código del programa principal debe dar la salida que se muestra:
*/
public class Pizza {

	private String tamanio;
	
	private String tipo;
	
	private String estado;
	
	private static int TotalPedidas=0;
	
	private static int TotalServidas=0;
	
	public Pizza(String tam, String tip) {
		
		this.tamanio=tam;
		
		this.tipo=tip;
		
		this.estado="pedida";
		
		Pizza.TotalPedidas++;
		
	}
	
	public String toString() {
		return "pizza " +this.tipo+" " +this.tamanio+", "+this.estado;
	}
	
	public static int getTotalPedidas() {
		return Pizza.TotalPedidas;
	}
	
	public static int getTotalServidas() {
		return Pizza.TotalServidas;
	}
	
	public void sirve() {
		if(this.estado.equals("pedida")) {
			this.estado="servida";
			Pizza.TotalServidas++;
		}else {
			System.out.println("Esta pizza ya se ha servido");
		}
	}
	
}
