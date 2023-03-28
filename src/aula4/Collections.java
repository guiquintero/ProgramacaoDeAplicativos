package aula4;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(2313, "Gui");
		Cliente cliente2 = new Cliente(2315, "Monique");
		Cliente cliente3 = new Cliente(3532, "Igor");
		Cliente cliente4 = new Cliente(7552, "Du");
		Cliente cliente5 = new Cliente(7842, "Salter");
		Cliente cliente6 = new Cliente(1234, "Antony");
		Cliente cliente7 = new Cliente(9876, "Vinicius");
		
		
		List <Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);
		listaCliente.add(cliente5);
		listaCliente.add(cliente6);
		listaCliente.add(cliente7);
		
		for(int i=0; i < listaCliente.size(); i++) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(listaCliente.get(i));
		}
		for(Cliente cliente : listaCliente) {

			if(cliente.getCpf()==1234) {
				System.out.println("-/-/-/-/-/-/-/-/-/-");
				System.out.println(cliente.getNome());
				System.out.println("-/-/-/-/-/-/-/-/-/-");
				break;
			}
		}
		
		
	}
}
