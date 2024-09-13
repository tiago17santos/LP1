package classesFotos.praia;

public class Praia {

    String nome;
    String localizacao;
    double tamanho;

    public Praia(String nome, String localizacao,  double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;

    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void atualizarTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return "\nNome: " + this.nome + ", Localização: " + this.localizacao + ", Tamanho: " + this.tamanho + " metros.";
    }
}
