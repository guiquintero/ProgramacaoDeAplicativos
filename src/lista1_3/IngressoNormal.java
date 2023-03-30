package lista1_3;

public class IngressoNormal extends Ingresso{

	public IngressoNormal(double valor, String tipo) {
		super(valor, tipo);
		// TODO Auto-generated constructor stub
	}
	public void imprimirDadosImgresso(){
		System.out.println("=-=-=-=-=-=-=");
		System.out.println("Valor do Ingresso: "+String.format("%.2f", this.valor)+"\nTipo: "+this.tipo);
		System.out.println("=-=-=-=-=-=-=");
	 }
}	
