package classesFotos.escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    String nome;
    List<String> alunos;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }


    public void adicionarAluno(String nomeAluno) {
        alunos.add(nomeAluno);
        System.out.println("\nAluno " + nomeAluno + " adicionado com sucesso.\n");
    }


    public void removerAluno(String nomeAluno) {
        if (alunos.remove(nomeAluno)) {
            System.out.println("\nAluno " + nomeAluno + " removido com sucesso.\n");
        } else {
            System.out.println("\nAluno " + nomeAluno + " não encontrado.\n");
        }
    }


    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("\nNenhum aluno matriculado.");
        } else {
            System.out.println("\nAlunos matriculados:");
            for (String aluno : alunos) {
                System.out.println("- " + aluno);
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("\nNome da Escola: " + nome);
        listarAlunos();
    }

    public String toString(){
        return "\nNome: " + this.nome + ", Alunos: " + this.alunos;
    }
}
