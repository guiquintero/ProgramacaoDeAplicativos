package lista3_4;

public class Filme {
    private String titulo;
    private int duracao;
    private double preco;
    private int diaLocacao;
    private int diaPrevistaDevolucao;
    private int diaDevolucao;
    private double multa;
    private Pessoa cliente;
    private boolean disponivel;

    public Filme(String titulo, int duracao, double preco,  Pessoa cliente) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.preco = preco;
        this.diaLocacao = 0;
        this.diaPrevistaDevolucao = 0;
        this.diaDevolucao = 0;
        this.multa = 0.0;
        this.cliente = cliente;
        this.disponivel = true;
    }

    public void setDiaLocacao(int diaLocacao) {
        this.diaLocacao = diaLocacao;
    }

    public void setDiaPrevistaDevolucao(int diaPrevistaDevolucao) {
        this.diaPrevistaDevolucao = diaPrevistaDevolucao;
    }

    public void setDiaDevolucao(int diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void locarFilme(Pessoa cliente, int diaLocacao) {
       if (this.disponivel) {
           this.cliente = cliente;
           this.diaLocacao = diaLocacao;
           this.diaPrevistaDevolucao = diaLocacao + 3;
           this.disponivel = false;
       } else {
           System.out.println("Filme não disponível");
       }
    }

    public void devolverFilme(int diaDevolucao) {
        if(!this.disponivel) {
            this.diaDevolucao = diaDevolucao;
            this.disponivel = true;
            if (this.diaDevolucao > this.diaPrevistaDevolucao) {
                this.multa = (this.diaDevolucao - this.diaPrevistaDevolucao) * 2;
                System.out.println("=-=-=-=-=-=-=-=-=-=");
                System.out.println("Filme alugado: " + this.titulo + "\nCliente: " + this.cliente.getNome()+"\nData de locação: "+this.diaLocacao+"\nData de devolução: "+this.diaDevolucao+"\nData prevista de devolução: "+this.diaPrevistaDevolucao);
                System.out.println("Filme devolvido com atraso, multa de R$" + this.multa+", total de R$"+(this.multa+this.preco));
                System.out.println("=-=-=-=-=-=-=-=-=-=");
            }
        } else {
            System.out.println("Filme não está locado");
        }
        
    }
    
    
}
