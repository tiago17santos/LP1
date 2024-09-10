package classes.portaObjetos;

import java.util.ArrayList;
import java.util.List;

public class PortaObjetos {

    String cor;
    String tamanho;
    List<String> objetos;

    public PortaObjetos() {
    }

    public PortaObjetos(String cor, String tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.objetos = new ArrayList<>();
    }

    public void addObjeto(String objeto) {

        objetos.add(objeto);
        System.out.println("Aluno " + objeto + " adicionado com sucesso.");
    }

    public void removeObjeto(String objeto) {

        if (objetos.remove(objeto)){
            System.out.println("Aluno " + objeto + " removido com sucesso.");
        } else {
            System.out.println("Aluno " + objeto + " não encontrado.");
        }
    }

    public void listarObjetos() {
        if (objetos.isEmpty()) {
            System.out.println("Nenhum objeto encontrado.");
        } else {
            System.out.println("Objetos cadastrados: ");
            for (String aluno : objetos) {
                System.out.println("- " + aluno);
            }
        }
    }


}
