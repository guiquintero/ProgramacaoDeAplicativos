package lista1;

public class ImovelTeste {
	public static void main(String[] args) {
		ImovelNovo imovel1 = new ImovelNovo("Rua das Baleias", 10000.00, 1000.00);
		
		ImovelVelho imovel2 = new ImovelVelho("Rua dos Pescados", 8000.00, 0.1);
		
		imovel1.mostrarInformacoes();
		imovel2.mostrarInformacoes();
	}
}
