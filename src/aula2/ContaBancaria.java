package aula2;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		calcularRendimento();
	}
	
	public void sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Valor insuficiente!\nVerifique seu saldo");
		}
		
	}
	
	public void mostaSaldo() {
		System.out.println("========================================");
		System.out.println("Nome: "+this.titular+"\nNumero: "+this.numero+"\nSaldo: "+ String.format("%.2f", this.saldo));
		System.out.println("========================================");
	}
	
	public void calcularRendimento() {
		this.saldo +=this.saldo*0.1;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
