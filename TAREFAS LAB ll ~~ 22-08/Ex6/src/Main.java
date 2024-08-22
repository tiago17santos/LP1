
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite uma temperatura em fahrenheit: ");
        double grausF = sc.nextDouble();

        System.out.println(grausF + "°F é: " + String.format("%.2f", calculaTemp(grausF)) + "°C");

        sc.close();
    }

    public static double calculaTemp(double grausF){
        return (grausF-32)/1.8;
    }
}