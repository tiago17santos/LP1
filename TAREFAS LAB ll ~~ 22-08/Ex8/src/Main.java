
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n = sc.nextDouble();

        if( n > 0 | n == 0){
            System.out.println("Positivo");

        }else{
            System.out.println("Negativo");
        }

        sc.close();
    }


}