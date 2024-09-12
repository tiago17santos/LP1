package classesFotos.arvore;

import java.util.Objects;

public class Arvore {

    String especie;
    String localizacao;
    double altura;
    double largura;
    String estacaoAno;


    public Arvore() {
    }

    public Arvore(String especie, String localizacao, double altura, double largura, String estacaoAno) {

        this.especie = especie;
        this.localizacao = localizacao;
        this.altura = altura;
        this.largura = largura;
        this.estacaoAno = estacaoAno;
    }

    public void cairFolhas(){
        if (Objects.equals(estacaoAno, "outono") || Objects.equals(estacaoAno, "inverno")){
            System.out.println("\nNão há mais folhas, somente na próxima primavera");
        }else {
            System.out.println("\nA árvore está repleta de folhas");
        }
    }

    public void verificarFrutos(){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            System.out.println("\nPode iniciar sua colheita a arvore está com frutos");
        }
        else{
            System.out.println("\nA árvore não está com frutos, aguarde..");
        }
    }

    public void crescer(){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            this.altura += 0.30;
        }
        else{
            System.out.println("\nNo momento a árvore não está crescendo, aguarde..");
        }
    }

    public String toString(){
        return "\nEspécie: " + this.especie + ", Localização: " + this.localizacao + ", Altura: " + this.altura + "metros, Largura: " + this.largura + ", Estação do Ano: " + this.estacaoAno +".";
    }
}
