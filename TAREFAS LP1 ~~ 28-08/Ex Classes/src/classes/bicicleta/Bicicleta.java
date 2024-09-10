package classes.bicicleta;

public class Bicicleta {

    String cor;
    String marca;
    String modelo;
    int tamanhoAro;
    double preco;
    double velocidade;

    public Bicicleta() {
    }

    public Bicicleta(String cor, String marca, String modelo, int tamanhoAro, double preco, double velocidade) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoAro = tamanhoAro;
        this.preco = preco;
        this.velocidade = velocidade;
    }

    public void pedalar(){
        this.velocidade += 5;
        System.out.println("Você pedalou. A bicicleta está agora a " + this.velocidade + " km/h.");
    }

    public void freiar(){
        this.velocidade -= 3;
        System.out.println("Você freiou. A bicicleta está agora a " + this.velocidade + " km/h.");
    }

}
