package lista3_4;

public class Dependente extends Pessoa{
    
    public Dependente(String nome, String data, String telefone, Endereco endereco) {
        super(nome, data, telefone, endereco);
    }

    public String getNome() {
        return nome;
    }
}
