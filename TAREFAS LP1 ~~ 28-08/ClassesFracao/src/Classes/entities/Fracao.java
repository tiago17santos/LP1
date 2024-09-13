package Classes.entities;

public class Fracao {

    double numerador;
    double denominador;

    public Fracao(double numerador, double denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Fracao somar(Fracao outraFracao){
        double novoNumerador = numerador * outraFracao.denominador + outraFracao.numerador * denominador;
        double novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outraFracao) {
        double novoNumerador = numerador * outraFracao.denominador - outraFracao.numerador * denominador;
        double novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outraFracao) {
        double novoNumerador = numerador * outraFracao.numerador;
        double novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outraFracao) {
        if (outraFracao.numerador == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        double novoNumerador = numerador * outraFracao.denominador;
        double novoDenominador = denominador * outraFracao.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public double mdc(double num, double den) {
        while (den != 0) {
            double temp = num % den;
            num = den;
            den = temp;
        }
        return num;
    }

    public void simplificar() {
        double divisorComum = mdc(numerador, denominador);
        numerador /= divisorComum;
        denominador /= divisorComum;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }


}
