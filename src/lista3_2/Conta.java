package lista3_2;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private List<Prato> pratosPedidos;
	private double valorTotal=0.0;
	
	
	
	public Conta() {
		this.pratosPedidos = new ArrayList<Prato>();
	}

	public void adicionarPrato(Prato prato) {
		pratosPedidos.add(prato);
	}
	
	public void fecharConta() {

		for (Prato prato : pratosPedidos) {
			valorTotal += prato.getPreco();
			
			System.out.println(prato.getNomePrato()+"****** R$ "+String.format("%.2f", prato.getPreco()));
		}
		
		valorTotal = valorTotal + (valorTotal*0.1);

		System.out.println("Valor total: R$ "+String.format("%.2f", valorTotal));
		
	}
	
	
}
