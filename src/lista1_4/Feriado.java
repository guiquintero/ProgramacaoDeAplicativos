package lista1_4;

public class Feriado extends Data{
	private String descricao;

	public Feriado() {
		this.descricao = "Feriado";
	}

	public Feriado(String descricao) {
		this.descricao = descricao;
	}

	public Feriado(int dia, int mes, int ano, String descricao) {
		super(dia, mes, ano);
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "===============\n"+this.dia+"/"+this.mes+"/"+this.ano+" - "+this.descricao;
	}
	
	
	
	
}
