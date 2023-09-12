import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        Ninja []ninjas = new Ninja[100];
        Aldeia aldeia = new Aldeia("Aldeia da folha",200,"Sul",ninjas);
        int x = 0;
        int n = 0;
        Ninja ninjaaux;
        String nome, titulo, ranking;
        int idade;
        //Criando o Scanner
        Scanner sc = new Scanner(System.in);
        //Interação com o usuário
        while(x != -1){
            System.out.println("Digite:\n 1 Info da vila " +
                    "\n 2 Adicionar ninja " +
                    "\n 3 Ver quais ninjas possuem ranking S " +
                    "\n 4 Ver quantos de cada tipo de ninja tem na vila " +
                    "\n 5 para ver a info de um ninja específico");
            x = sc.nextInt();
            switch (x){
                case 1:
                    aldeia.mostraInfo();
                    break;
                case 2:
                    System.out.println("Digite o nome, idade, titulo(Gennin Chunnin ANBU) e rankiing(S A B C D E) do ninja:");
                    sc.nextLine();
                    nome = sc.nextLine();
                    idade = sc.nextInt();
                    sc.nextLine();
                    titulo = sc.nextLine();
                    ranking = sc.nextLine();
                    ninjaaux = new Ninja(nome,idade,titulo,ranking);
                    aldeia.adicionarNinja(ninjaaux);
                    break;
                case 3:
                    aldeia.rankingS();
                    break;
                case 4:
                    aldeia.qtdTitulos();
                    break;
                case 5:
                    System.out.println("Digite o número do ninja que você quer ver as informações:");
                    n = sc.nextInt();
                    if(aldeia.ninjas[n] != null)
                        aldeia.ninjas[n].mostraInfo();
                    else
                        System.out.println("Esse ninja não existe");
                default:
                    System.out.println("Não existe essa opção");
                    break;
            }
        }


    }
}