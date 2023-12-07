package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando funcionarios
        Funcionario func = new Funcionario();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;



        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Funcionarios!");
            System.out.println("2-Listar funcionarios");
            System.out.println("3-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome do funcionario");
                    func.setNomeFunc(sc.nextLine());
                    System.out.println("Cpf do funcionario");
                    func.setCpfFunc(sc.nextLine());
                    System.out.println("Idade do funcionario");
                    func.setIdadeFunc(sc.nextInt());

                    arq.escrever(func);

                    break;

                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList <Funcionario> funcs = arq.ler();

                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("INFORMACOES DO FUNCIONARIO");
                        System.out.println(funcs.get(i).getNomeFunc());
                        System.out.println(funcs.get(i).getIdadeFunc());
                        System.out.println(funcs.get(i).getCpfFunc());

                    }
                    break;

                case 3:
                    flag =false;
                    break;

            }

        }
    }
}