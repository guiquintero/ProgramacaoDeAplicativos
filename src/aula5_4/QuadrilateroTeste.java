package aula5_4;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Quadrilatero quadrilatero1 = new Quadrado("vermehlo", 5);
		Quadrilatero quadrilatero2 = new Retangulo("roxo", 4, 6);
		Quadrilatero quadrilatero3 = new Losango("Amarelo", 5, 8);
		
		quadrilatero1.calcularArea();
		quadrilatero1.calcularPerimetro();
		
		quadrilatero2.calcularArea();
		quadrilatero2.calcularPerimetro();
		
		quadrilatero3.calcularArea();
		quadrilatero3.calcularPerimetro();
	}
}
