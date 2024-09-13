package classesFotos.bicicleta;

public class Bicicleta {

    String cor;
    String marca;
    double preco;
    double velocidade;

    public Bicicleta(String cor, String marca, double preco, double velocidade) {
        this.cor = cor;
        this.marca = marca;
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

    public String toString(){
        return "\nCor: " + this.cor + ", Marca: " + this.marca + ", Preço: " + this.preco + " reais, Velocidade: " + this.velocidade + "km/h.\n";
    }

}
