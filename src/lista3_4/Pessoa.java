package lista3_4;

public class Pessoa {
    protected String nome;
    protected String data;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(String nome, String data, String telefone, Endereco endereco) {
        this.nome = nome;
        this.data = data;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
}
