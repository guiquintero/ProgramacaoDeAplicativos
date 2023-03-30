package lista1_3;

public class Ingresso {
	protected double valor;
	protected String tipo;
	
	public Ingresso(double valor, String tipo) {

		this.valor = valor;
		this.tipo = tipo;
	}
	
	 public void imprimirDadosImgresso(){
		 System.out.println("Valor do Ingresso: "+String.format("%.2f", this.valor)+"\nTipo: "+this.tipo);
	 }

	public void setValor(double valor) {
		this.valor = valor;
	}
	 
}
