package org.example;

public class Nave_Composição {

    //Atributos da nave
    String nome;
    int velocidade;
    Arma arma = null;
    //Metodos da nave
    public void mostraInfo(){
        System.out.println("Nome da nave: "+nome);
        System.out.println("Velocidade da nave "+velocidade);
    }

    public Nave_Composição(String nome, int velocidade, Arma arma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.arma = arma;
    }

    public void IgetAgunQuestionMark(){
        if(arma == null)
            System.out.println("Ss");
        else
            System.out.println("Nn");
    }

}
