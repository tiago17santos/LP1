
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu salario mensal atual?");
        double salario = sc.nextDouble();

        System.out.println("Qual o percentual de reajuste do seu salario?");
        double perc = sc.nextDouble();

        salario += (salario * (perc / 100));

        System.out.printf("Seu novo salario é: R$ %.2f%n",salario);

        sc.close();
    }
}