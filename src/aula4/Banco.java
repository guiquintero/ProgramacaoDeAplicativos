package aula4;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private int cnpj;
	private String razaoSocial;
	private List<ContaBancaria> contasBancaria;
	
	public Banco(int cnpj, String razaoSocial) {

		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.contasBancaria = new ArrayList<ContaBancaria>();
	}

	public void criarNovaConta(int nConta, String nome) {
		ContaBancaria cb1 = new ContaBancaria(nConta, nome);
		contasBancaria.add(cb1);
	}
	
	public void removerConta(int nConta) {
		for(ContaBancaria /*tipo da variavel*/ conta /*variavel temporaria*/ : contasBancaria /*nome da lista*/) {
			if(conta.getNumeroConta() == nConta) {
				this.contasBancaria.remove(conta);
				break;
			}
		}
	}
	
	public void realizarSaque(Double valor, int nConta) {
		for(ContaBancaria conta : contasBancaria) {
			if(conta.getNumeroConta() == nConta) {
				conta.realizarSaque(valor);
				break;
			}
		}
	}
	public void realizarDeposito(Double valor, int nConta) {
		for(ContaBancaria conta : contasBancaria) {
			if(conta.getNumeroConta() == nConta) {
				conta.realizarDeposito(valor);
				break;
			}
		}
	}
	
	public void mostrarSaldo(int nConta) {
		for(ContaBancaria conta : contasBancaria) {
			if(conta.getNumeroConta() == nConta) {
				conta.mostrarSaldo();
				break;
			}
		}
	}
	
	
	
	public void listarContas() {
		for(ContaBancaria contas : contasBancaria) {
			contas.mostrarSaldo();
		}
	}
}
