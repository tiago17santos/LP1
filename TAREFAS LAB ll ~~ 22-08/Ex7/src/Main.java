
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n = sc.nextDouble();
        if( n > 10){
            System.out.println("É MAIOR QUE 10!");
        }else if( n < 10){
            System.out.println("NÃO É MAIOR QUE 10!");
        }else{
            System.out.println("É 10!");
        }

        sc.close();
    }


}