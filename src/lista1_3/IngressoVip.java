package lista1_3;

public class IngressoVip extends Ingresso{
	protected double valorAdicional;
	protected String localizacao;
	
	public IngressoVip(double valor, String tipo, double valorAdicional, String localizacao) {
		super(valor, tipo);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
		calcularValorIngressoVip(valor,valorAdicional);
		
	}
	
	private void calcularValorIngressoVip(double valor, double adicional) {
		setValor(valor+adicional);
	}
	
	public void imprimirDadosImgresso(){
		 System.out.println("Valor do Ingresso Vip: "+String.format("%.2f", this.valor)+"\nTipo: "+this.tipo+"\nLocalizacao: "+this.localizacao);
	 }
	
}
