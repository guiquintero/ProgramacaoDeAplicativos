package aula3;

public class Endereco {
	private String logrador;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	
	public Endereco(String logrador, int numero, String bairro, String cidade, String unidadeFederativa) {

		this.logrador = logrador;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}


	@Override
	public String toString() {
		return logrador + ", Nº " + numero + ", " + bairro + ", " + cidade
				+ ", " + unidadeFederativa;
	}


	public String getLogrador() {
		return logrador;
	}


	public void setLogrador(String logrador) {
		this.logrador = logrador;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}


	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
	
	
	
	
	
}
