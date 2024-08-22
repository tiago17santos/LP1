
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double qtdMaca;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas maças você comprou? ");
        qtdMaca = sc.nextDouble();

        if( qtdMaca < 12){
            total = qtdMaca * 1.30;
            System.out.println(total);

        }else if( qtdMaca >= 12){
            System.out.println(qtdMaca);
        }
        sc.close();     
    }


}