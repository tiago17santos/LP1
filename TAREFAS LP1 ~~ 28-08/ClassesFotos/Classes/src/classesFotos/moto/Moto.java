package classesFotos.moto;

public class Moto {

    String cor;
    String marca;
    double preco;
    double potencia;
    double velocidade;
    boolean ligado;

    public Moto(String cor, String marca, double preco, double potencia, double velocidade, boolean ligado) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public void acelerar() {
        this.velocidade += 5;
        System.out.println("Você acelerou. A moto está agora a " + this.velocidade + " km/h.");
    }

    public void frear() {
        this.velocidade -= 3;
        System.out.println("Você freiou. A moto está agora a " + this.velocidade + " km/h.");
    }

    public void ligar(){
        if (this.ligado) {

            System.out.println("A moto está ligada");
        }else{
            System.out.println("A moto está desligada");
        }

    }

    public String toString(){
        return "\nCor: " + this.cor + ", Marca: " + this.marca + ", Preço: " + this.preco + " reais, Potência: " + this.potencia + " Velocidade: " + this.velocidade + "km/h.";
    }


}
