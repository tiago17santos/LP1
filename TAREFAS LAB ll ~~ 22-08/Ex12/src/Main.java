
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número aleatório: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro numéro aleatório: ");
        double n2 = sc.nextDouble();

        while(n1==n2){
            System.out.println("Digite outro numéro aleatório diferente do primeiro: ");
            n2 = sc.nextDouble();
        }

        if( n1 > n2){
            System.out.println("O número: " + n1 + " é maior");

        }else{
            System.out.println("O número: " + n2 + " é maior");
        }

        sc.close();
    }


}