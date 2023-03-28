package aula5_1;

public class Aviao extends Veiculo {
	private int altitudeMaxima;
	
	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel,
			int altitudeMaxima) {
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.altitudeMaxima = altitudeMaxima;
	}

	public void voar() {
		System.out.println(this.getModelo()+" esta decolando!");
	}

	public int getAltitudeMaxima() {
		return altitudeMaxima;
	}

	public void setAltitudeMaxima(int altitudeMaxima) {
		this.altitudeMaxima = altitudeMaxima;
	}
	
	public String toString() {
		return "Aviao:\n -Altitude Maxima: " + this.altitudeMaxima + "\n -Modelo: " + this.modelo + "\n -Fabricante: " + this.fabricante + "\n -Ano: "
				+ this.ano + "\n -Numero de Passageiros: " + this.numeroPassageiros + "\n -Combustivel: " + this.combustivel;
	}

}
