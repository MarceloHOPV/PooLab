package org.example;

public class Sargento extends Soldado implements Defesa{

    private String especializacao;
    private int experienciaCombate;

    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
        if(this.IE != null)
            experienciaCombate += 300;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialização: " + especializacao);
        System.out.println("Esperiencia em combate: " + experienciaCombate);
    }

    @Override
    public void defender() {
        if(this.experienciaCombate > 650)
            System.out.println(getNome() + " conseguiu se defender");
        else
            System.out.println(getNome() + " não se defendeu");
    }
}
