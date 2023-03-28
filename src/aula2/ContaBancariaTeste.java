package aula2;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(123, "Gui");
		
		conta1.mostaSaldo();
		conta1.depositar(100.00);
		conta1.mostaSaldo();
		conta1.sacar(120.00);
		conta1.mostaSaldo();
		conta1.sacar(110.00);
		conta1.mostaSaldo();
		
	}
}
