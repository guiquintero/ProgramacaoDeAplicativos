package aula6_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome, logrador, bairro, cidade, estado;
		int idade, cpf, numero, cep;
		
		try {
			System.out.println("Incera as seguintes informacoes sobre uma pessoa:");
			System.out.println("Nome: ");
			nome = input.nextLine();
			
			System.out.println("Idade: ");
			idade = input.nextInt();
			
			System.out.println("CPF: ");
			cpf = input.nextInt();
			input.nextLine();
			
			System.out.println("Logrador: ");
			logrador = input.nextLine();
			
			System.out.println("Numero: ");
			numero = input.nextInt();
			input.nextLine();
			
			System.out.println("Bairro: ");
			bairro = input.nextLine();
			
			System.out.println("Cidade: ");
			cidade = input.nextLine();
			
			System.out.println("Estado: ");
			estado = input.nextLine();
			
			System.out.println("CEP: ");
			cep = input.nextInt();
			
			Pessoa pessoa1 = new Pessoa(nome, logrador, bairro, cidade, estado, idade, cpf, numero, cep);
			System.out.println(pessoa1);
			
		} catch (InputMismatchException ime) {
			System.out.println("Entrada invalida!");
		} catch (Exception e) {
			System.out.println("Ocorreu uma execao!");
		} finally {
			input.close();
			System.out.println("Execucao do bloco finally");
		}
		
		
	}
}
