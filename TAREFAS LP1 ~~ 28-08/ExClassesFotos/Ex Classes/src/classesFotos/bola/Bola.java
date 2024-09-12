package classesFotos.bola;

public class Bola {

    String cor;
    String tipo;
    double arMax = 15.0;
    double arAtual;

    public Bola() {
    }

    public Bola(String cor, String tipo, double arAtual) {
        this.cor = cor;

        this.tipo = tipo;
        this.arAtual = arAtual;
    }

    public void inflar(){
        if (arAtual > arMax){
            System.out.println("Não é possivel encher mais a bola..");

        }else {
            arAtual += 2.5;
        }
    }

    public void esvaziar(){
        if (arAtual > 0){
            arAtual -= 2.5;
            System.out.println("Você está esvaziando a bola..");

        }else {
            System.out.println("Não é possivel esvaziar mais a bola..");
        }
    }

    public String toString(){
        return "\nCor: " + this.cor + ", Tipo: " + this.tipo + ", Ar máximo suportado: " + this.arMax + ", Ar atual: " + this.arAtual + ".";
    }
}
