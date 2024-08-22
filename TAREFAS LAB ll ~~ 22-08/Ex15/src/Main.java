
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas você trabalhou: ");
        double hrsTrab = sc.nextDouble();
        System.out.println("Qual o valor da sua hora? ");
        double hrSalario = sc.nextDouble();

        double resultado = hrSalario * hrsTrab;

        if( hrsTrab>40){
            resultado +=   hrSalario * 0.5;
            hrsTrab -= 40;
            System.out.println("Após " + hrsTrab + " hrs extras trabalhadas, seu salario é: " + String.format("%.2f",resultado));

        }else{

            System.out.println("Seu salario é: " + String.format("%.2f", resultado));
        }

        sc.close();
    }


}