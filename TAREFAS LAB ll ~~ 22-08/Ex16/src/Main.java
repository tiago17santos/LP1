public class Main {
    public static void main(String[] args) {

        int jan = 15000;
        int fev = 23000;
        int mar = 17000;

        double despesa = jan+fev+mar;

        double media = (despesa)/3;

        System.out.println("O valor total das despesas é: R$" + String.format("%.2f",despesa)
                + " e a média mensal é: R$" + String.format("%.2f",media));

    }
}