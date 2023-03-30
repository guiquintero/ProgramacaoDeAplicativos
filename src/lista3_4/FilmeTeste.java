package lista3_4;

public class FilmeTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", 1, "Bairro 1", "Cidade 1", "Estado 1");
        Pessoa pessoa = new Pessoa("Pessoa 1", "01/01/2001", "11111111", endereco);
        Dependente dependente = new Dependente("Dependente 1", "01/01/2001", "11111111", endereco);
        Socio socio = new Socio("Socio 1", "01/01/2001", "11111111", endereco, 11111111111L, dependente);
        Filme filme = new Filme("Filme 1", 0, 15.0, socio);
        Filme filme2 = new Filme("Filme 2", 0, 25.0, socio);
        
        filme2.locarFilme(dependente, 0);

        filme.locarFilme(socio, 5);
        
        filme.devolverFilme(9);
        filme2.devolverFilme(9);
    }
}
