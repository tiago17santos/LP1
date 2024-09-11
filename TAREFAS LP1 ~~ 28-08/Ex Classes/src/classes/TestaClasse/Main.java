package classes.TestaClasse;


import classes.aluno.Aluno;
import classes.arvore.Arvore;
import classes.bicicleta.Bicicleta;
import classes.bola.Bola;
import classes.escola.Escola;
import classes.moto.Moto;
import classes.portaObjetos.PortaObjetos;
import classes.praia.Praia;
import classes.psicina.Psicina;
import classes.roupa.Roupa;


import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        boolean saiu = false;
        String op;
        do{
            switch (menu()){
                case 1:
                    System.out.println("Qual seu nome: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Qual seu cpf: ");
                    String cpfAluno = sc.nextLine();

                    System.out.println("Qual seu email: ");
                    String emailAluno = sc.nextLine();

                    System.out.println("Qual sua idade: ");
                    int idadeAluno = sc.nextInt();

                    Aluno aluno = new Aluno(nomeAluno,cpfAluno,emailAluno,idadeAluno);

                    System.out.println("Você deseja alterar o email? (s/n) ");
                    op = sc.next();

                    if(op.equals("s")){
                        String novoEmailAluno = sc.nextLine();
                        aluno.alterarEmail(novoEmailAluno);
                    }

                    System.out.println("Você deseja alterar o email? (s/n) ");
                    op = sc.next();

                    if(op.equals("s")){
                        int novoIdadeAluno = sc.nextInt();
                        aluno.atualizaIdade(novoIdadeAluno);
                    }
                    System.out.println(aluno);
                    break;

                case 2:
                    System.out.println("Qual a espécie da árvore: ");
                    String especieArvore = sc.nextLine();

                    System.out.println("Qual a localização da árvore: ");
                    String localizacaoArvore = sc.nextLine();

                    System.out.println("Qual estação do ano está? ");
                    String estacaoAno = sc.nextLine();

                    System.out.println("Qual a altura da árvore: ");
                    double alturaArvore = sc.nextDouble();

                    System.out.println("Qual a largura da árvore: ");
                    double larguraArvore = sc.nextDouble();

                    Arvore arvore = new Arvore(especieArvore,localizacaoArvore,alturaArvore,larguraArvore,estacaoAno);

                    System.out.println(arvore);

                    arvore.crescer();
                    arvore.verificarFrutos();
                    arvore.cairFolhas();

                    break;

                case 3:
                    System.out.println("Qual a cor da sua bicicleta?  ");
                    String corBike = sc.nextLine();

                    System.out.println("Qual a marca da sua bicicleta?  ");
                    String marcaBike = sc.nextLine();

                    System.out.println("Qual o preço da sua bicicleta?  ");
                    double precoBike = sc.nextDouble();

                    System.out.println("Qual a velocidade atual da sua bicicleta?  ");
                    double velocidadeBike = sc.nextDouble();

                    Bicicleta bicicleta = new Bicicleta(corBike,  marcaBike,  precoBike,  velocidadeBike);

                    System.out.println(bicicleta);

                    System.out.println("Você deseja pedalar ou freiar? (p/f) ");
                    op = sc.next();

                    if(op.equals("p")){
                        bicicleta.pedalar();
                    }
                    else if(op.equals("f")){
                        bicicleta.freiar();
                    }
                    else{
                        System.out.println("Essa opção não válida");
                    }

                     break;

                case 4:

                    System.out.println("Qual a cor da sua bola?  ");
                    String corBola = sc.nextLine();

                    System.out.println("Qual a marca da sua bola?  ");
                    String tipoBola = sc.nextLine();

                    System.out.println("Qual o preço da sua bola?  ");
                    double arAtual = sc.nextDouble();

                    Bola bola = new Bola(corBola,tipoBola,arAtual);

                    System.out.println(bola);

                    System.out.println("Você deseja inflar ou esvaziar a bola? (p/f) ");
                    op = sc.next();

                    if(op.equals("i")){
                        bola.inflar();
                    }
                    else if(op.equals("e")){
                        bola.esvaziar();
                    }
                    else{
                        System.out.println("Essa opção não válida");
                    }

                     break;

                case 5:
                    System.out.println("Qual o nome da escola? ");
                    String nomeEscola = sc.nextLine();

                    Escola escola = new Escola(nomeEscola);

                    System.out.print("Digite o nome do aluno que será adicionado: ");
                    String nomeAlunoNovo = sc.nextLine();

                    escola.adicionarAluno(nomeAlunoNovo);
                    escola.mostrarInfo();

                    break;

                case 6:
                    System.out.println("Qual a cor da sua moto? ");
                    String corMoto = sc.nextLine();

                    System.out.println("Qual a marca da sua moto? ");
                    String marcaMoto = sc.nextLine();

                    System.out.println("Qual o preço da sua moto? ");
                    double precoMoto = sc.nextDouble();

                    System.out.println("Qual a potência da sua moto? ");
                    double potenciaMoto = sc.nextDouble();

                    System.out.println("Qual a velocidade da sua moto? ");
                    double velocidadeMoto = sc.nextDouble();

                    System.out.println("Sua moto está ligada? (true/false) ");
                    boolean ligado = sc.nextBoolean();

                    Moto moto = new Moto(corMoto,marcaMoto,precoMoto,potenciaMoto,velocidadeMoto,ligado);

                    if(ligado){
                        moto.acelerar();
                        moto.frear();
                    }else{
                        moto.ligar();
                    }

                    break;

                case 7:

                    System.out.println("Qual a cor do seu porta objetos ");
                    String corPO = sc.nextLine();

                    System.out.println("Qual o tamanho do seu porta objetos ");
                    String tamPO = sc.nextLine();

                    PortaObjetos portaObjetos = new PortaObjetos(corPO,tamPO);

                    System.out.print("Digite o nome do objeto que será adicionado: ");
                    String nomeObjt = sc.nextLine();

                    portaObjetos.addObjeto(nomeObjt);
                    portaObjetos.listarObjetos();

                    break;

                case 8:
                    System.out.println("Qual nome da praia");
                    String nomePraia = sc.nextLine();

                    System.out.println("Qual a localização da praia ");
                    String locPraia = sc.nextLine();

                    System.out.println("Qual o tamanho da praia ");
                    double tamPraia = sc.nextDouble();

                    Praia praia = new Praia(nomePraia, locPraia, tamPraia);

                    System.out.println("Deseja atualizar o nome da praia? (s/n)");
                    op = sc.next();

                    if(op.equals("s")){

                        System.out.println("Qual nome da praia");
                        nomePraia = sc.nextLine();

                        praia.atualizarNome(nomePraia);
                    }

                    System.out.println("Deseja atualizar o tamanho da praia? (s/n)");
                    op = sc.next();

                    if(op.equals("s")){
                        System.out.println("Qual o tamanho da praia ");
                        tamPraia = sc.nextDouble();
                        praia.atualizarTamanho(tamPraia);
                    }

                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    saiu = true;
                    break;
            }
        }
        while (!saiu);
        sc.close();

    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Selecione umas das opções para interagir nas classes..");

        System.out.println("1 - Acessar classe Aluno");
        System.out.println("2 - Acessar classe Arvore");
        System.out.println("3 - Acessar classe Bicicleta");
        System.out.println("4 - Acessar classe Bola");
        System.out.println("5 - Acessar classe Escola");
        System.out.println("6 - Acessar classe Moto");
        System.out.println("7 - Acessar classe PortaObjetos");
        System.out.println("8 - Acessar classe Praia");
        System.out.println("9 - Acessar classe Psicina");
        System.out.println("10 - Acessar classe Roupa");
        System.out.println("11 - Sair");

        int op = sc.nextInt();

        return op;
    }
}