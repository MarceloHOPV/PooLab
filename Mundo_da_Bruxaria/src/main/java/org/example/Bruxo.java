package org.example;

public class Bruxo {
    //Inicialização de variáveis
    String Nome;
    String Casa;
    String Varinha;
    boolean Quadribol;
    //mostra as informações desse aluno
    void mostraInfo(){
        System.out.println("Bruxo " + Nome + ":");
        System.out.println("Casa: " + Casa);
        System.out.println("Varinha: " + Varinha);
        if (Quadribol == true)
            System.out.println("Faz parte do time de quadribol");
        else
            System.out.println("Não faz parte do time de quadribol");
    }
    //contrutor pra facilitar a vida
    public Bruxo(String nome, String casa, String varinha, boolean quadribol) {
        this.Nome = nome;
        this.Casa = casa;
        this.Varinha = varinha;
        this.Quadribol = quadribol;
    }
}
