package aula5_2;

public class Professor extends Pessoa{
	private Double salario;
	
	public Professor(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, String nome,
			int idade, Double salario) {
		super(logradouro, numero, bairro, cidade, unidadeFederativa, nome, idade);
		this.salario = salario;
	}

	public void calcularSalario() {
		System.out.println("O salario de "+this.nome+" esta sendo calculado!");
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "===========================\n-Professor: \nSalario: " + this.salario + "\nNome: " + this.nome + "\nIdade: " + this.idade + 
				"\n -Endereco de " + this.nome + ": \n  Logrador: " + this.end.getLogradouro() + "\n  Numero: " + this.end.getNumero() + 
				"\n  Bairro: " + this.end.getBairro() + "\n  Cidade: " + this.end.getCidade() + "\n  Unidade Federativa: " + this.end.getUnidadeFederativa();
	} 
	
	
}
