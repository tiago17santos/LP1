package classes.moto;

public class Moto {

    String cor;
    String marca;
    double preco;
    double potencia;
    double velocidade;
    boolean ligado;



    public Moto() {
    }

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
        System.out.println("Você pedalou. A moto está agora a " + this.velocidade + " km/h.");
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


}
