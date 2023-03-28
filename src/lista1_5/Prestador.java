package lista1_5;

public class Prestador extends Colaborador{
	
	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "Prestador [valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome + ", endereco="
				+ endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
