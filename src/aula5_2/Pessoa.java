package aula5_2;

public class Pessoa {
	protected Endereco end;
	protected String nome;
	protected int idade;

	public Pessoa(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, String nome, int idade) {
		this.end = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
