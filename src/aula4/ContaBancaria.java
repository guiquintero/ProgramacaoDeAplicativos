package aula4;

public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	private String nomeCliente;
	
	public ContaBancaria(int numeroConta, String nomeCliente) {

		this.numeroConta = numeroConta;
		this.saldo = 00.0;
		this.nomeCliente = nomeCliente;
	}
	
	public void mostrarSaldo() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Titular: "+this.nomeCliente+"\nConta: "+ this.numeroConta+"\nSaldo: R$ "+this.saldo);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public void realizarSaque(Double valor) {
		if(valor>this.saldo){
			System.out.println("Saldo insuficiente.");
		}else {
			this.saldo-=valor;
			System.out.println("Saque realizado com sucesso!");
		}
	}
	
	public void realizarDeposito(Double valor) {
		this.saldo+=valor;
		System.out.println("Deposito realizado com sucesso");
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
}
