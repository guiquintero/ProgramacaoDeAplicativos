package aula4;

public class ContaTeste {	
	public static void main(String[] args) {
		
		Banco banco1 = new Banco(12345, "Inter");
		banco1.criarNovaConta(123, "Guilherme");
		banco1.criarNovaConta(456, "Igor");
		banco1.criarNovaConta(987, "Monique");
		
		banco1.listarContas();
		banco1.removerConta(987);
		banco1.listarContas();
		banco1.realizarDeposito(80.0, 123);
		banco1.listarContas();
		banco1.realizarSaque(60.0, 123);
		banco1.listarContas();
		banco1.mostrarSaldo(123);
	}
}
