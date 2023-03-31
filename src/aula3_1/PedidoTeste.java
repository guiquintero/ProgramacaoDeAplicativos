package aula3_1;

public class PedidoTeste {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, "10/10/2020", "10:10", "Dinheiro", Status.ENVIADO, 100.0);
        pedido1.mostrarDados();
    }
}
