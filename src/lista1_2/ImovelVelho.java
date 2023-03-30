package lista1_2;

public class ImovelVelho extends Imovel{
	
	private double desconto;
	
	public ImovelVelho(String endereco, double valorBase, double desconto) {
		super(endereco, valorBase);
		this.desconto = desconto;
	}



	public void mostrarInformacoes() {
		System.out.println("--Imovel-Novo--\n Endereco: "+this.endereco+"\n\tValor Base: "+this.valorBase+"\n\t Valor Adicional: "+this.desconto);
	}
}
