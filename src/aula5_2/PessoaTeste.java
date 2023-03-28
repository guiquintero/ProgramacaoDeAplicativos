package aula5_2;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Rua Dr. Jorge", 30, "Jardim", "Sao Paulo", "SP", "Gui", 21, "BCC");
		
		Professor professor1 = new Professor("Rua Dr. Jorge", 40, "Jardim", "Sao Paulo", "SP", "Igor", 23, 1000.0);
		
		System.out.println(aluno1);
		aluno1.realizarMatricula();
		System.out.println(professor1);
		professor1.calcularSalario();
		
		
	}
}
