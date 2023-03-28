package lista1;

public class Aluno extends Pessoa{

	private int numeroMatricula;

	public Aluno(String nome, String nascimento, long rg, long cpf, int numeroMatricula) {
		super(nome, nascimento, rg, cpf);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void mostrarDados() {
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("--Aluno--\nNome: "+nome+"\nNascimento: "+this.nascimento+"\nRG: "+this.rg+"\nCPF: "
							+this.cpf+"\nNumero de Matricula: "+this.numeroMatricula);
		System.out.println("=-=-=-=-=-=-=-=-=-=");
	}
}
