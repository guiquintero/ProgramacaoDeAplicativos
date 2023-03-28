package aula6_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		try {
			System.out.println("Informe o valor do numerador: ");
			double numerador = input.nextInt();
			
			System.out.println("Informe o valor do denominador: ");
			double denominador = input.nextInt();
			
			calculadora.dividir(numerador, denominador);
		}
		catch (InputMismatchException ime) {
			System.out.println("Entrada de daods invalida!");
		}
		catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
		finally {
			input.close();
			System.out.println("Execucao do bloco finally");
		}
		
	}
}
