package org.example;

public class Nave {
    //Atributos da nave
    String nome;
    int velocidade;
    Arma arma = null;
    //Metodos da nave
    public void mostraInfo(){
        System.out.println("Nome da nave: "+nome);
        System.out.println("Velocidade da nave "+velocidade);
    }
    public void adicionarArma(Arma gun){
        System.out.println("Arma adicionda");
        this.arma = gun;
    }

    public void IgetAgunQuestionMark(){
        if(arma == null)
            System.out.println("Ss");
        else
            System.out.println("Nn");
    }

}
