package classes.roupa;

public class Roupa {

    String cor;
    String tamanho;
    double preco;
    boolean apertada;

    public Roupa() {
    }

    public Roupa(boolean apertada, String cor, String tamanho, double preco) {
        this.apertada = apertada;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;

    }

    public void apertar() {
        System.out.println("A roupa foi apertada.");
    }

    public void atualizarPreco(double valor) {
        this.preco = valor;
        System.out.println("O preço agora é " + this.preco + " m.");
    }

    public void atualizarCor(String cor) {
        this.cor = cor;
        System.out.println("A nova cor é: " + this.cor + " .");

    }
}
