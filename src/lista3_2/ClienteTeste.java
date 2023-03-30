package lista3_2;

import java.util.List;

public class ClienteTeste {
	public static void main(String[] args) {
		Prato prato1 = new Prato(1, "Porcao de Batata Frita", "Entrada", "Batata, oleo, sal, cheddar", 15.0);
		Prato prato2 = new Prato(2, "X-burgues", "Prato Principal", "Pao, carne, queijo", 35.0);
		Prato prato3 = new Prato(3, "X-bacon", "Prato Principal", "Pao, carne, queijo, bacon", 40.0);
		Prato prato4 = new Prato(4, "X-salada", "Prato Principal", "Pao, carne, queijo, tomate, alface", 38.9);
		Prato prato5 = new Prato(5, "Musse", "Sobremesa", "Leite condensado, maracuja, creme de leite", 22.9);

		Conta conta1 = new Conta();

		Cliente cliente = new Cliente("Gui", 12345667, conta1);

		conta1.adicionarPrato(prato1);
		conta1.adicionarPrato(prato2);
		conta1.adicionarPrato(prato3);
		conta1.adicionarPrato(prato4);
		conta1.adicionarPrato(prato5);
		conta1.fecharConta();
	}
}
