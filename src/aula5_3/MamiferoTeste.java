package aula5_3;

import java.util.Scanner;

public class MamiferoTeste {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Mamifero mamifero = null;

		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		System.out.println("Opcao: ");

		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			mamifero = new Gato("Felix", "Laranja");
			break;
		case 2:
			mamifero = new Cachorro("Rex", "Pastor");
			break;
		case 3:
			mamifero = new Cavalo("Spirit", "Mangaloraga");
			break;
		default:
			mamifero = null;
		}
		mamifero.emitirSom();
	}
}
