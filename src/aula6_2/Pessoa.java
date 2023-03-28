package aula6_2;

public class Pessoa {
	private String nome, logrador, bairro, cidade, estado;
	private int idade, cpf, numero, cep;
	
	public Pessoa(String nome, String logrador, String bairro, String cidade, String estado, int idade, int cpf,
			int numero, int cep) {

		this.nome = nome;
		this.logrador = logrador;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.idade = idade;
		this.cpf = cpf;
		this.numero = numero;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "-Pessoa-\nNome: " + this.nome + "\nIdade: "+ this.idade+"\nCPF: "+this.cpf+"\nEndereco-\n Logrador: "+this.logrador+"\n Numero: "+this.numero+
				"\n Bairro: "+this.bairro+"\n Cidade: "+this.cidade+"\n Estado: "+this.estado+"\n CEP: "+this.cep;
		
	}
	
	
	
}
