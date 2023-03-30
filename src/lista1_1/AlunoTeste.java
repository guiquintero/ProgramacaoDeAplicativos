package lista1_1;

public class AlunoTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Guilherme", "04/03/2002", 386725330, 492998388);
		Aluno aluno1 = new Aluno("Pedro", "09/07/2004", 396328310, 562792388, 80087);
		
		pessoa1.mostrarDados();
		aluno1.mostrarDados();
	}
}
