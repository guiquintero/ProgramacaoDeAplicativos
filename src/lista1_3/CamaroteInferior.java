package lista1_3;

public class CamaroteInferior extends IngressoVip{

	public CamaroteInferior(double valor, String tipo, double valorAdicional, String localizacao) {
		super(valor, tipo, valorAdicional, localizacao);
		// TODO Auto-generated constructor stub
	}

	public void imprimirDadosImgresso(){
		System.out.println("=-=-=-=-=-=-=");
		System.out.println("Valor do Ingresso Vip: "+String.format("%.2f", this.valor)+"\nTipo: "+this.tipo+"\nLocalizacao: "+this.localizacao);
		System.out.println("=-=-=-=-=-=-=");
	 }
	
}
