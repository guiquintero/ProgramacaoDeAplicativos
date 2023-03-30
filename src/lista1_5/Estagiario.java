package lista1_5;

public class Estagiario extends Funcionario{
	private int ciee;

	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}

	public int getCiee() {
		return ciee;
	}

	public void setCiee(int ciee) {
		this.ciee = ciee;
	}

	@Override
	public String toString() {
		return "Estagiario [ciee=" + ciee + ", funcao=" + funcao + ", salario=" + salario + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	public void mostrarDados() {
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nData de Inicio: "+this.dataInicio+"\nFuncao: "+this.funcao+
				"\nSalario: "+this.salario+"\nCIEE: "+this.ciee);
		System.out.println("=-=-=-=-=-=-=-=");
	}
}
