package lista1_5;

public class Autonomo extends Prestador {
	private long cpf;

	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	public void mostrarDados() {
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nData de Inicio: "+this.dataInicio+"\nCusto da hora: "+this.valorHora+
				"\nTipo de Servico: "+this.tipoServico+"\nCNPJ: "+this.cpf);
		System.out.println("=-=-=-=-=-=-=-=");
	}
	
}
