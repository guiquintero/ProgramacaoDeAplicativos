package aula5_3;

public abstract class Mamifero {
	
	protected String nome, raca;
	
	public Mamifero(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public void emitirSom() {
		System.out.println("Som generico");
	}
}
