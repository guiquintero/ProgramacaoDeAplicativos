package aula5_4;

public class Quadrado extends Quadrilatero{
	private double lado;
	
	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	public void calcularArea() {
		System.out.println("Area do quadrado: "+ this.lado*this.lado);
	}
	
	public void calcularPerimetro() {
		System.out.println("Perimetro do quadrado: "+ this.lado*4);
	}
	
	
	
}
