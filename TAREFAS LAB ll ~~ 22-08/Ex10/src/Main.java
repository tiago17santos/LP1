
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota a sua 1° avaliação: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a nota a sua 2° avaliação: ");
        double n2 = sc.nextDouble();

        double total = (n1 + n2) /2;

        if( total >= 6){
            System.out.println("Aprovado");

        }else{
            System.out.println("Reprovado");
        }
        sc.close();
    }


}