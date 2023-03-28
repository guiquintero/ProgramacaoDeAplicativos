package aula5_1;

public class VeiculoTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Comander", "Jeep", 2022, 4, "Disel", 4);
		carro1.abastecer();
		carro1.calibrarPneus();
		System.out.println(carro1);
		
		Aviao aviao1 = new Aviao("A-380", "AirBus", 1980, 800, "Querosene ", 4000);
		aviao1.abastecer();
		aviao1.voar();
		System.out.println(aviao1);
		
	}
}
