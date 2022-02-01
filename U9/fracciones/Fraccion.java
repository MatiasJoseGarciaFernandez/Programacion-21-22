package fracciones;
/*Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.*/

public class Fraccion {
	
	private int numerador;
	
	private int denominador;
	
	private int signo;
	
	
	public Fraccion(int n, int d) {
		if(d == 0) {
			System.out.println("Error. El denominador no puede ser 0");
		} else {
			if(n*d < 0) {
				this.signo=-1;
			} else {
				this.signo=1;
			}
			this.numerador = Math.abs(n);
			this.denominador = Math.abs(d);
		}
	}
	
	public int cogeNumerador() {
		return this.numerador;
	}
	
	public int cogeDenominador() {
		return this.denominador;
	}
	
	public String toString() {
		if(signo==-1) {
			return "-" + this.numerador + "/" + this.denominador;
		} else {
			return this.numerador +"/"+this.denominador;
		}
	}
	
	public Fraccion invierte() {
		return new Fraccion(this.signo * this.denominador, this.numerador);
	}
	
	public Fraccion multiplica(int n) {
		return new Fraccion(this.signo * this.numerador * n, this.denominador);
	}
	
	public Fraccion divide(int n) {
		return new Fraccion(this.signo * this.numerador, this.denominador * n);
	}
	
	public Fraccion simplifica() {
		int s = this.signo;
		int n = this.numerador;
		int d = this.denominador;
		for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
			while (((n % i) == 0) && ((d % i) == 0)) {
				n /= i;
				d /= i;
			}
		}
		return new Fraccion(s * n, d);
	}
}
