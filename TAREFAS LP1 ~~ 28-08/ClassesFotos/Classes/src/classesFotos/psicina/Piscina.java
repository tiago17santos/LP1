package classesFotos.psicina;

public class Piscina {

    double comprimento;
    double largura;
    double profundidade;
    double temperatura;

    public Piscina(double comprimento, double largura, double profundidade, double temperatura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.temperatura = temperatura;
    }

    public void atualizarTemperatura(double temperatura) {
        this.temperatura = temperatura;
        System.out.println("A temperatura está agora a " + this.temperatura + " °C.");
    }

    public void atualizarComprimento(double comprimento) {
        this.comprimento = comprimento;
        System.out.println("O comprimento está agora a " + this.comprimento + " m.");
    }

    public void atualizarProfundidade(double profundidade) {
        this.profundidade = Piscina.this.profundidade;
        System.out.println("A profundidade agora é: " + this.comprimento + " m.");
    }





}
