package aula3_1;

public class Pedido {
    private int numero;
    private String data;
    private String hora;
    private String formaPagamento;
    private Status status;
    private double valorTotal;
    
    public Pedido(int numero, String data, String hora, String formaPagamento, Status status, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.formaPagamento = formaPagamento;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public void mostrarDados() {
        System.out.println("Numero: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Status: " + status.getStatus());
        System.out.println("Valor total: " + valorTotal);
    }
    
}
