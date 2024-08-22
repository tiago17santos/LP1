
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double custoFabrica;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o custo de fabrica para produzir este carro?");
        custoFabrica = sc.nextInt();

        System.out.printf("O custo do consumidor é: R$ %.2f%n",calculaCustoCarro(custoFabrica));

        sc.close();
    }

    public static double calculaCustoCarro(double custoFabrica){
        double percDistribuidor = 0.28;
        double impostos = 0.45;

        return  custoFabrica + ( custoFabrica * percDistribuidor) + (custoFabrica * impostos);

    }
}