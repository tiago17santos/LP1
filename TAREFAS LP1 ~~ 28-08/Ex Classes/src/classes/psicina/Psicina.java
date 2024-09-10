package classes.psicina;

public class Psicina {

    double comprimento;
    double largura;
    double profundidade;
    double temperatura;
    String tipo;

    public Psicina() {
    }

    public Psicina(double comprimento, double largura, double profundidade, double temperatura, String tipo) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.temperatura = temperatura;
        this.tipo = tipo;
    }

    public void atualizarTemperatura(double temperatura) {
        this.temperatura = temperatura;
        System.out.println("A temperatura está agora a " + this.temperatura + " °C.");
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
