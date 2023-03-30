package lista3_2;

public class Prato {
	private int numero;
	private String nomePrato, tipo, descricaoIngredientes;
	private double preco;
	public Prato(int numero, String nomePrato, String tipo, String descricaoIngredientes, double preco) {

		this.numero = numero;
		this.nomePrato = nomePrato;
		this.tipo = tipo;
		this.descricaoIngredientes = descricaoIngredientes;
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	
	
	
}
