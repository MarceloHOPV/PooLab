package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando o Scanner
        Scanner sc = new Scanner(System.in);
        //Instanciando a escola
        Escola escola = new Escola("ObviamenteHogwarts","Naruto");
        //Criando o bruxo mas não instanciando
        Bruxo []bruxao = new Bruxo[100];
        //Declaração de variáveis
        int entrada = 0;
        String nomeAux;
        String casaAux;
        String varinhaAux;
        Boolean quadribolAux;
        int cont = 0;//Contador de bruxos
        //Frufru
        System.out.println("Olá caro bruxo!\n" +
                "Esse software foi desenvolvido para que possamos juntos gerenciar a escola " + escola.Nome);
        //Lógica
        while(entrada != -1)
        {
            //Printando casos
            System.out.println("Digite:\n" +
                    "1 - Para adicionar um bruxo\n" +
                    "2 - Para mostrar as informações da escola e dos alunos presentes nela\n" +
                    "3 - Para mostrar os jogadores que jogam Quadribol\n" +
                    "4 - Para mostrar a quantidade de bruxos que tem a Varinha de Cerejeira\n" +
                    "-1 - Para sair");
            //pegando qual caso a pessoa quer
            entrada = sc.nextInt();
            //switch com os casos
            switch (entrada)
            {
                //caso 1 adicionar alunos
                case 1:
                    System.out.println("Entre com o nome do bruxo:");
                    sc.nextLine();
                    nomeAux = sc.nextLine();
                    System.out.println("Entre com a casa do bruxo:(Grifinória, Sonserina, Corvinal ou Lufa-Lufa)");
                    casaAux = sc.nextLine();
                    System.out.println("Entre com a varinha do bruxo:(Azevinho, Cerejeira ou Sabugueira)");
                    varinhaAux = sc.nextLine();
                    System.out.println("Entre com true caso o aluno esteja no time de qudribol e false caso contrário");
                    quadribolAux = sc.nextBoolean();
                    bruxao[cont] = new Bruxo(nomeAux,casaAux,varinhaAux,quadribolAux);
                    //for para percorrer os bruxos das escolas
                    for (int i = 0; i < escola.bruxos.length; i++) {
                        //if para ver se tem bruxo lá ou não
                        if(escola.bruxos[i] == null) {
                            escola.adicionarBruxo(bruxao[cont]);
                            cont++;//almenta o numero de bruxos
                            break;//break para não continuar adicionando o mesmo bruxo
                        }
                    }
                    break;
                //Caso 2 mostrar as informações da escola e dos alunos presentes nela
                case 2:

                    escola.mostraInfo();

                    break;
                //Caso 3 mostrar quem são os jogadores de quadribol
                case 3:

                    escola.jogadoresQua();

                    break;
                //Caso 4 mostrar quantos alunos utilizam a Varinha de Cerejeira
                case 4:

                    escola.varinhaCerejeira();

                    break;
            }
        }


    }
}