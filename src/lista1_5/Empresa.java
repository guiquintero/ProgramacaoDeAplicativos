package lista1_5;

public class Empresa extends Prestador{
	private long cnpj;

	public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

	public void mostrarDados() {
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nData de Inicio: "+this.dataInicio+"\nCusto da hora: "+this.valorHora+
				"\nTipo de Servico: "+this.tipoServico+"\nCNPJ: "+this.cnpj);
		System.out.println("=-=-=-=-=-=-=-=");
	}
	
}
