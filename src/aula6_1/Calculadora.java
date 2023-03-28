package aula6_1;

public class Calculadora {
	public void dividir(double numerador, double denominador) {
		try {
			double resultado = numerador/denominador;
			System.out.println("Resultado: "+resultado);
			
		} catch (ArithmeticException ae) {
			System.out.println("Nao eh possivel dividir por zero!");
		}
	}
}
