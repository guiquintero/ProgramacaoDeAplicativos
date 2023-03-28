package aula2;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio relogio1= new Relogio("Rolex", 0, 0);
	
		relogio1.setHora(15);
		relogio1.setMinuto(8);
		relogio1.mostrarHoras();
	}
	
}
