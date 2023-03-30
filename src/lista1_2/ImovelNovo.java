package lista1_2;

public class ImovelNovo extends Imovel{
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void mostrarInformacoes() {
		System.out.println("--Imovel-Novo--\n Endereco: "+this.endereco+"\n Valor Base: \t"+this.valorBase+"\n Valor Adicional: \t+"
	+this.valorAdicional+"\n Total: \t"+(this.valorBase+this.valorAdicional));
	}
}
