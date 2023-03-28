package aula5_2;

public class Aluno extends Pessoa {
	private String curso;
	
	public Aluno(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, String nome,
			int idade, String curso) {
		super(logradouro, numero, bairro, cidade, unidadeFederativa, nome, idade);
		this.curso = curso;
	}

	public void realizarMatricula() {
		System.out.println("A matriculo de "+this.nome+" esta sendo realizada.");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "===========================\\n-Aluno: \nCurso: " + this.curso + "\nNome: " + this.nome + "\nIdade: " + this.idade + 
				"\n -Endereco de " + this.nome + ": \n  Logrador: " + this.end.getLogradouro() + "\n  Numero: " + this.end.getNumero() + 
				"\n  Bairro: " + this.end.getBairro() + "\n  Cidade: " + this.end.getCidade() + "\n  Unidade Federativa: " + this.end.getUnidadeFederativa();
	} 
	
	
	
}
