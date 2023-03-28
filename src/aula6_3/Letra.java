package aula6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Letra {
	Scanner input = new Scanner(System.in);
	public void comparar() throws InputMismatchException, Exception{
		
		
		System.out.println("Digite uma palavra: ");
		String palavra1 = input.nextLine();
		
		System.out.println("Digite outra palavra uma palavra: ");
		String palavra2 = input.nextLine();
		
		if(palavra1.equals(palavra2))
			System.out.println("As duas palavras sao iguais");
		else
			System.out.println("As duas palavras sao diferentes");

	}
	
	public void contarQuantidade() throws InputMismatchException, Exception{
		System.out.println("Digite uma palavra: ");
		String palavra1 = input.nextLine();
		
		System.out.println("A palavra possui "+palavra1.length()+" caracteres");
		

	}
	
	public void fecharInput() {
		input.close();
	}
	
}
