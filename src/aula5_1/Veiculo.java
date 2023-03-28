package aula5_1;

public class Veiculo {
	

	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected int numeroPassageiros;
	protected String combustivel;
	
	public Veiculo(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}
	
	public void abastecer() {
		System.out.println(this.getModelo()+" esta abastecendo!");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
}
