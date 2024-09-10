package classes.arvore;

import java.util.Date;
import java.util.Objects;

public class Arvore {

    String nome;
    String especie;
    String localizacao;
    double altura;
    double largura;
    String estacaoAno;


    public Arvore() {
    }

    public Arvore(String nome, String especie, String localizacao, double altura, double largura, String estacaoAno) {
        this.nome = nome;
        this.especie = especie;
        this.localizacao = localizacao;
        this.altura = altura;
        this.largura = largura;
        this.estacaoAno = estacaoAno;
    }

    public void cairFolhas(){
        if (Objects.equals(estacaoAno, "outono") || Objects.equals(estacaoAno, "inverno")){
            System.out.println("Não há mais folhas, somente na próxima primavera");
        }else {
            System.out.println("A árvore está repleta de folhas");
        }
    }

    public void verificarFrutos(){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            System.out.println("Pode iniciar sua colheita a arvore está com frutos");
        }
        else{
            System.out.println("A árvore não está com frutos, aguarde..");
        }
    }

    public void crescer(){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            this.altura += 0.30;
        }
        else{
            System.out.println("No momento a árvore não está crescendo, aguarde..");
        }
    }
}
