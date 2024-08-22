
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        double anoAtual = sc.nextDouble();

        System.out.println("Digite seu ano de nascimento: ");
        double anoNasc = sc.nextDouble();

        double total = anoAtual - anoNasc;

        if( total >= 16){
            System.out.println("Pode votar");

        }else{
            System.out.println("Não pode votar");
        }

        sc.close();
    }


}