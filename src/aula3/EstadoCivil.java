package aula3;

public enum EstadoCivil {
	SOLTEIRO(0, "solterio"),
	CASADO(1, "casado"),
	DIVORCIADO(2, "divorciado"),
	VIUVO(3, "viuco");
	
	private int numero;
	private String estado;
	
	private EstadoCivil(int numero, String estado) {
		this.estado = estado;
		this.numero = numero;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public String getEstado(){
		return estado;
	}
}
