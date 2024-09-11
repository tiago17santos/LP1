package classes.aluno;

public class Aluno {

    String nome;
    String cpf;
    String email;
    int idade;



    public Aluno() {
    }

    public Aluno(String nome, String cpf, String email, int idade) {
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;

        this.nome = nome;
    }

    public String alterarEmail (String email){
        return this.email = email;
    }

    public int atualizaIdade (int novaIdade){
        return this.idade = novaIdade;
    }

    public String toString() {
        return "\nNome: " + this.nome + ", CPF: " + this.cpf + ", E-mail: " + this.email + ", Idade: " + this.idade +".";
    }

}
