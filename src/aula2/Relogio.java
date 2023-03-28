package aula2;

public class Relogio {
	private String marca;
	private int hora;
	private int minuto;
	
	public Relogio(String marca, int hora, int minuto) {
		this.marca = marca;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public void mostrarHoras(){
		System.out.println("Sao: "+this.hora+"hs"+this.minuto);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora>23 || hora<0) {
			System.out.println("Hora invalida");
		}
		else {
			this.hora = hora;
			System.out.println("Hora alterado");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto>59 || minuto<0) {
			System.out.println("Minuto invalida");
		}
		else {
			this.minuto = minuto;
			System.out.println("Minuto alterado");
		}
	}

	public String getMarca() {
		return marca;
	}
	
	
}
