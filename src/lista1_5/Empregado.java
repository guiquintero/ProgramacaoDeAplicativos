package lista1_5;

public class Empregado extends Funcionario{
	private int carteiraTrabalho;

	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
			int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@Override
	public String toString() {
		return "Empregado [carteiraTrabalho=" + carteiraTrabalho + ", funcao=" + funcao + ", salario=" + salario
				+ ", nome=" + nome + ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	public void mostrarDados() {
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Nome: "+this.nome+"\nEndereco: "+this.endereco+"\nData de Inicio: "+this.dataInicio+"\nFuncao: "+this.funcao+
				"\nSalario: "+this.salario+"\nCarteira de Trabalho: "+this.carteiraTrabalho);
		System.out.println("=-=-=-=-=-=-=-=");
	}
}
