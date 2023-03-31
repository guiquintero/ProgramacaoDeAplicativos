package aula3_1;

public enum Status {
    PREPARANDO(0, "Fazendo"),
    AGUAUARDANDO_PAGAMENTO(1, "Aguardando pagamento"),
    PAGO(2, "Pago"),
    ENVIADO(3, "Enviado");

    private int numero;
    private String status;
    
    private Status(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }
    public String getStatus() {
        return status;
    }
}
