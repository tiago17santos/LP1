package classes.praia;

public class Praia {

    String nome;
    String localizacao;
    String tipo;
    double tamanho;

    public Praia() {
    }

    public Praia(String nome, String localizacao, String tipo, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.tamanho = tamanho;

    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void atualizarTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
