package aula5_2;

public class Endereco {
	public String logradouro;
	public int numero;
	public String bairro;
	public String cidade;
	public String unidadeFederativa;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	
}
