package classesFotos.escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    String nome;
    List<String> alunos;

    public Escola() {
    }

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }


    public void adicionarAluno(String nomeAluno) {
        alunos.add(nomeAluno);
        System.out.println("Aluno " + nomeAluno + " adicionado com sucesso.");
    }


    public void removerAluno(String nomeAluno) {
        if (alunos.remove(nomeAluno)) {
            System.out.println("Aluno " + nomeAluno + " removido com sucesso.");
        } else {
            System.out.println("Aluno " + nomeAluno + " não encontrado.");
        }
    }


    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            System.out.println("Alunos matriculados:");
            for (String aluno : alunos) {
                System.out.println("- " + aluno);
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Nome da Escola: " + nome);
        listarAlunos();
    }

    public String toString(){
        return "\nNome: " + this.nome + ", Alunos: " + this.alunos;
    }
}
