
import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) {

        int inicio, fim, inicioS, fimS, resultado;
        String terminou;

        Scanner sc = new Scanner(System.in);
        System.out.println("O jogo terminou no mesmo dia? (s/n)");
        terminou = sc.next();


        if (terminou.equals("s")) {

            System.out.println("Qual horario de inicio do jogo");
            inicio = sc.nextInt();

            System.out.println("Qual horario do fim do jogo");
            fim = sc.nextInt();

            resultado =  fim - inicio ;
            System.out.println("O jogo durou: " + resultado + " horas.");

        }
        else if (terminou.equals("n")) {
            if (calcularDia() == 1){
                System.out.println("Qual horario de inicio do jogo no 1° dia: ");
                inicio = sc.nextInt();

                System.out.println("Qual horario do fim do jogo no 1° dia: ");
                fim = sc.nextInt();

                while(fim < inicio){
                    System.out.println("Horário Incorreto!! ");
                    System.out.println("Digite o horario do fim do jogo no 1° dia novamente: ");
                    fim = sc.nextInt();
                }

                System.out.println("Qual horario de inicio do jogo no 2° dia: ");
                inicioS = sc.nextInt();

                System.out.println("Qual horario do fim do jogo no 2° dia: ");
                fimS = sc.nextInt();

                while(fimS < inicioS){
                    System.out.println("Horário Incorreto!! ");
                    System.out.println("Digite o horario do fim do jogo no 2° dia novamente: ");
                    fimS = sc.nextInt();
                }

                resultado =  fim - inicio + fimS - inicioS;
                System.out.println("O jogo durou: " + resultado + " horas.");
            }
            else{
                System.out.println("Horario inválido!");
            }
        }
        else{
            System.out.println("Digite uma opção válida!");
        }

        sc.close();
    }

    public static long calcularDia(){
        String dataInicio;
        String dataFim;
        LocalDate dateBefore;
        LocalDate dateAfter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a data do inicio do jogo (dd-MM-yyyy)");
        dataInicio = sc.next();

        System.out.println("Qual a data do fim do jogo (dd-MM-yyyy)");
        dataFim = sc.next();

        int diaInicio = Integer.parseInt(dataInicio.split("-")[0]);
        int mesInicio = Integer.parseInt(dataInicio.split("-")[1]);
        int anoInicio = Integer.parseInt(dataInicio.split("-")[2]);

        int diaFim = Integer.parseInt(dataFim.split("-")[0]);
        int mesFim = Integer.parseInt(dataFim.split("-")[1]);
        int anoFim = Integer.parseInt(dataFim.split("-")[2]);

        dateBefore = LocalDate.of(anoInicio,mesInicio,diaInicio);
        dateAfter = LocalDate.of(anoFim,mesFim,diaFim);

        return DAYS.between(dateBefore, dateAfter);
    }
}