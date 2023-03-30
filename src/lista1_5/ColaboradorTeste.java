package lista1_5;

public class ColaboradorTeste {
	public static void main(String[] args) {
		Colaborador colaborador1 = new Empregado("Gui", "R. das Baleias", "04/03/2020", "Tecnico TI", 1500.00, 12314);
		Colaborador colaborador2 = new Estagiario("Pedro", "R. Tubarao", "07/05/2020", "RH", 900.00, 8786);
		Colaborador colaborador3 = new Empresa("Ana", "R. Dr. Ramon", "17/02/2022", 8.0, "Seguranca", 98787623);
		Colaborador colaborador4 = new Autonomo("Muca", "R. sem saida", "23/11/2021", 6.0, "Consultor", 621685345);
		
		colaborador1.mostrarDados();
		colaborador2.mostrarDados();
		colaborador3.mostrarDados();
		colaborador4.mostrarDados();
		
	}
}
