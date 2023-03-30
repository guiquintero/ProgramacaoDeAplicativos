package lista1_3;

public class CamaroteSuperior extends IngressoVip{

	public CamaroteSuperior(double valor, String tipo, double valorAdicional, String localizacao) {
		super(valor, tipo, valorAdicional, localizacao);

	}
	
	public void imprimirDadosImgresso(){
		System.out.println("=-=-=-=-=-=-=");
		System.out.println("Valor do Ingresso Vip: "+String.format("%.2f", this.valor)+"\nTipo: "+this.tipo+"\nLocalizacao: "+this.localizacao);
		System.out.println("=-=-=-=-=-=-=");
	 }

}
