package aula5_4;

public class Retangulo extends Quadrilatero{
	protected double base, altura;

	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public void calcularArea() {
		System.out.println("Area do retangulo: "+ this.base*this.altura);
	}
	
	public void calcularPerimetro() {
		System.out.println("Perimetro do retangulo: "+ ((this.base*2)+(this.altura*2)));
	}
}
