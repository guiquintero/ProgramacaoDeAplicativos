package lista1_1;

public class Pessoa {
	protected String nome, nascimento;
	protected long rg, cpf;
	
	public Pessoa(String nome, String nascimento, long rg, long cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public void mostrarDados() {
		
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("--Pessoa--\nNome: "+this.nome+"\nNascimento: "+this.nascimento+"\nRG: "+this.rg+"\nCPF: "+this.cpf);
		System.out.println("=-=-=-=-=-=-=-=-=-=");
	}
}
