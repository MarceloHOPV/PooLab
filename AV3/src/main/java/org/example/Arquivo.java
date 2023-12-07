package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Jogador jog) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados                          //Apend true: Não sobrepõe o arquivo, false: Sobrepõe
            os = new FileOutputStream("arquivo.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Jogador ++\n");
            bw.write(jog.getNome() + "\n");
            bw.write(jog.getNumero() + "\n");
            bw.write(jog.getPosicao() + "\n");


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


    public ArrayList<Jogador> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList<Jogador> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Jogador ++")) {
                    // Variável auxiliar de funcionario
                    Jogador j1 = new Jogador();
                    j1.setNome(br.readLine());
                    j1.setNumero(Integer.parseInt(br.readLine()));
                    j1.setPosicao(br.readLine());

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(j1);
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