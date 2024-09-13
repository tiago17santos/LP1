package Classes.program;

import Classes.entities.Fracao;

public class Main {
    public static void main(String[] args) {
        Fracao f1 = new Fracao(13, 4);
        Fracao f2 = new Fracao(5, 2);

        Fracao resultadoSoma = f1.somar(f2);
        Fracao resultadoSubtracao = f1.subtrair(f2);
        Fracao resultadoMultiplicacao = f1.multiplicar(f2);
        Fracao resultadoDivisao = f1.dividir(f2);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);


    }
}