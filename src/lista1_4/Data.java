package lista1_4;

public class Data {
	protected int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		this.dia = 1;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia) {
		this.dia = dia;
		this.mes = 01;
		this.ano = 2019;
	}
	
	public Data() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 2019;
	}

	public String toString() {
		return "===============\n"+this.dia+"/"+this.mes+"/"+this.ano;
	}
	
}
