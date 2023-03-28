package aula5_4;

public class Losango extends Quadrilatero{
	protected double diagonalMenor, diagonalMaior, lado;

	public Losango(String cor, double diagonalMenor, double diagonalMaior) {
		super(cor);
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}

	public void calcularArea() {
		System.out.println("Area do retangulo: "+ (this.diagonalMenor*this.diagonalMaior)/2);
	}
	
	public void calcularPerimetro() {
		this.lado= Math.sqrt(Math.pow(diagonalMenor/2, 2)+Math.pow(diagonalMaior/2, 2));
		System.out.println("Perimetro do retangulo: "+ this.lado*4);
	}
	
	
}
