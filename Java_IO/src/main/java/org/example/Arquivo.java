package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Funcionario func) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados                          //Apend true: Não sobrepõe o arquivo, false: Sobrepõe
            os = new FileOutputStream("Funcionarios.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Funcionarios ++\n");
            bw.write(func.getNomeFunc() + "\n");
            bw.write(func.getCpfFunc() + "\n");
            bw.write(func.getIdadeFunc() + "\n");

            // 1. Escrita de forma estática, ou seja, direta

            linha="Olá mundo 3";
            bw.write("Olá mundo\n");
            bw.write("Olá mundo 2");
            bw.newLine();
            bw.write("amei demais\n");



        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Funcionario> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList<Funcionario> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Funcionarios ++")) {
                    // Variável auxiliar de funcionario
                    Funcionario f1 = new Funcionario();
                    f1.setNomeFunc(br.readLine());
                    f1.setCpfFunc(br.readLine());
                    f1.setIdadeFunc(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(f1);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }


        return encontreiNoArquivo;


    }
}