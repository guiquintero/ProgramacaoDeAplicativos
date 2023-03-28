package aula3;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("R. jao", 43, "Alface", "PG", "PR");
		Pessoa pessoa1 =new Pessoa("Guilherme","4 de marco de 2002", "masculino", "gui@gmail.com", EstadoCivil.SOLTEIRO, endereco1);
		System.out.println(pessoa1);
	}
}
