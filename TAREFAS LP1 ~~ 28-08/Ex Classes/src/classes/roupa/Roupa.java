package classes.roupa;

public class Roupa {

    String tipo;
    String cor;
    String tamanho;
    double preco;

    public Roupa() {
    }

    public Roupa(String tipo, String cor, String tamanho, double preco) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;

    }

    public void atualizarTipo(String tipo) {
        this.tipo = tipo;
        System.out.println("A temperatura está agora a " + this.tipo + " °C.");
    }

    public void atualizarComprimento(double comprimento) {
        this.comprimento = comprimento;
        System.out.println("O comprimento está agora a " + this.comprimento + " m.");
    }

    public void atualizarLargura(double largura) {
        this.largura = largura;
        System.out.println("O comprimento está agora a " + this.comprimento + " m.");
    }

    public void atualizarTipo(String tipo) {
        this.tipo = tipo;
        System.out.println("O tipo atual é: " + this.tipo + " .");

    }
}
