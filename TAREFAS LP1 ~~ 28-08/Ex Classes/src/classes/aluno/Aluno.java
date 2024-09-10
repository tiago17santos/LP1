package classes.aluno;

import java.util.Date;


public class Aluno {

    String nome;
    String cpf;
    String email;
    int idade;
    Date dtNascimento;
    double altura;


    public Aluno() {
    }

    public Aluno(String cpf, String email, int idade, Date dtNascimento, double altura, String nome) {
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.dtNascimento = dtNascimento;
        this.altura = altura;
        this.nome = nome;
    }

    public String alterarNome (String novoNome){
        return this.nome = novoNome;
    }

    public int atualizaIdade (int novaIdade){
        return this.idade = novaIdade;
    }


    //importar validacpf





}
