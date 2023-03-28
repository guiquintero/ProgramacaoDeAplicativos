package aula5_1;

public class Carro extends Veiculo {
	
	private int numeroPorta;
	
	public Carro(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel, int numeroPorta) {
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.numeroPorta = numeroPorta;
	}
	
	public void calibrarPneus() {
		System.out.println(this.getModelo()+" esta calibrando os pneus!");
	}

	public int getNumeroPorta() {
		return numeroPorta;
	}

	public void setNumeroPorta(int numeroPorta) {
		this.numeroPorta = numeroPorta;
	}

	@Override
	public String toString() {
		return "Carro:\n -Numero de Portas: " + this.numeroPorta + "\n -Modelo: " + this.modelo + "\n -Fabricante: " + this.fabricante + "\n -Ano: "
				+ this.ano + "\n -Numero de Passageiros: " + this.numeroPassageiros + "\n -Combustivel: " + this.combustivel;
	}
}
