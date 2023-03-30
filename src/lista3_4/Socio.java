package lista3_4;

public class Socio extends Pessoa {
    private long cpf;
    private Dependente dependente;

    public Socio(String nome, String data, String telefone, Endereco endereco, long cpf, Dependente dependente) {
        super(nome, data, telefone, endereco);
        this.cpf = cpf;
        this.dependente = dependente;
    }

    public String getNome() {
        return nome;
    }
    

    
}
