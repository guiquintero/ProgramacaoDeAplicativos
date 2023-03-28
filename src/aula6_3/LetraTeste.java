package aula6_3;
import java.util.InputMismatchException;

public class LetraTeste {
	public static void main(String[] args) {
		try {
			Letra letra =  new Letra();
			
			letra.comparar();
			letra.contarQuantidade();
			letra.fecharInput();
			
		} catch (InputMismatchException ime) {
			System.out.println("Valor invalido!");
		}catch (Exception e) {
			System.out.println("Execao disparada!");
		}
	}
}
