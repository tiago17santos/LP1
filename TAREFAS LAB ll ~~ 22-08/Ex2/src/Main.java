
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int eleitores;
        int votosBrancos;
        int votosNulos;
        int votosValidos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos eleitores tem na cidade?");
        eleitores = sc.nextInt();

        System.out.println("Quantos votos brancos?");
        votosBrancos = sc.nextInt();

        System.out.println("Quantos votos nulos?");
        votosNulos = sc.nextInt();

        System.out.println("Quantos votos validos?");
        votosValidos = sc.nextInt();

        double resultVotosBrancos =   (double) votosBrancos / eleitores * 100  ;
        double resultVotosNulos =   (double) votosNulos / eleitores * 100  ;
        double resultVotosValidos =   (double) votosValidos / eleitores * 100  ;

        if ((votosNulos + votosBrancos + votosValidos) > eleitores){
            System.out.println("Os valores digitados ultrapassam o numero de eleitores, digite novamente!");
        }else {


            System.out.println("Os votos brancos equivalem a: " + String.format("%.2f", resultVotosBrancos) + "% dos eleitores");
            System.out.println("Os votos nulos equivalem a: " + String.format("%.2f", resultVotosNulos) + "% dos eleitores");
            System.out.println("Os votos validos equivalem a: " + String.format("%.2f", resultVotosValidos) + "% dos eleitores");
        }





        sc.close();
    }


}