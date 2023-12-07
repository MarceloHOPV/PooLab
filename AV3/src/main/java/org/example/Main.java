package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        excessao e = new excessao();
        List<Jogador> Jogadores = new ArrayList<Jogador>();
        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando funcionarios
        Jogador jog = new Jogador();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;
        String posicaoAUX;
        int numeroAUX;
        int Goleiros = 0;
        int Atacantes = 0;
        int Zagueiros = 0;

        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar jogador!");
            System.out.println("2-Listar jogadores");
            System.out.println("3-Mostrar a quantidade de jogadores existentes em cada posição");
            System.out.println("4-Ordenar os jogadores em ordem decrescente em relação ao número");
            System.out.println("5-Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Nome do jogador");
                    jog.setNome(sc.nextLine());
                    System.out.println("Posição do jogador");
                    posicaoAUX = sc.nextLine();
                    System.out.println("Número do jogador");
                    numeroAUX = sc.nextInt();
                        jog.setPosicao(posicaoAUX);
                        jog.setNumero(numeroAUX);

                        if(numeroAUX > 0 && (posicaoAUX.equals("Goleiro") || posicaoAUX.equals("Atacante") || posicaoAUX.equals( "Zagueiro")))
                            arq.escrever(jog);
                    break;
                case 2:
                    //armazena o retorno do medoto de leitura
                    Jogadores = arq.ler();
                    for (int i = 0; i < Jogadores.size(); i++) {
                        System.out.println("INFORMACOES DO JOGADOR");
                        System.out.println(Jogadores.get(i).getNome());
                        System.out.println(Jogadores.get(i).getPosicao());
                        System.out.println(Jogadores.get(i).getNumero());

                    }
                    break;
                case 3:
                    for (int i = 0; i < Jogadores.size(); i++) {
                        if(Jogadores.get(i).getPosicao() != null) {
                            if (Jogadores.get(i).getPosicao().equals("Goleiro")) {
                                Goleiros++;
                            }
                            if (Jogadores.get(i).getPosicao().equals("Atacante")) {
                                Atacantes++;
                            }
                            if (Jogadores.get(i).getPosicao().equals("Zagueiro")) {
                                Zagueiros++;
                            }
                        }
                        System.out.println("Goleiro: "+Goleiros);
                        System.out.println("Atacante: "+Atacantes);
                        System.out.println("Zagueiro: "+Zagueiros);
                    }
                    break;
                case 4:
                    Collections.sort(Jogadores);
                    break;
                case 5:
                    flag =false;
                    break;

            }

        }

    }
}