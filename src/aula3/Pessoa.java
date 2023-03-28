package aula3;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private EstadoCivil estadoCivil;
	private Endereco endereco;
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil estadoCivil, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nSexo: " + sexo + "\nE-mail: " + email
				+ "\nEstado Civil: " + estadoCivil + "\nEndereco: " + endereco+"";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	

	
	
	
	
}
