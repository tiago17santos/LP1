
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos carros você vendeu? ");
        double qtdVendas = sc.nextDouble();

        System.out.println("Qual valor total das suas vendas? ");
        double valorVendas = sc.nextDouble();

        System.out.println("Qual seu salario fixo? ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Quantos você recebe por carro vendido? ");
        double comissaoVenda = sc.nextDouble();

        double resultado = salarioFixo + (comissaoVenda * qtdVendas) + (0.05 * valorVendas);

        System.out.printf("Salario final: R$ %.2f%n", resultado);

        sc.close();
    }
}