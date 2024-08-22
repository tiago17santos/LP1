
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int ano;
        int mes;
        int dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        ano = sc.nextInt();
        System.out.println("Quantos meses você tem?");
        mes = sc.nextInt();
        System.out.println("Quantos dias você tem?");
        dia = sc.nextInt();

        System.out.println(calculaIdade(ano,mes,dia));

        sc.close();
    }

    public static int calculaIdade(int ano, int mes, int dia){
        int resultado = (ano * 365) + (mes * 30) + dia;
        return resultado;
    }
}