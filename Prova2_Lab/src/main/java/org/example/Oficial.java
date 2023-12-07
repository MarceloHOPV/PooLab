package org.example;

public class Oficial extends Soldado implements Defesa{
    private String patente;

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: " + patente);
    }

    @Override
    public void defender() {
        if(this.IE != null)
            System.out.println(getNome() + " conseguiu se defender");
        else
            System.out.println(getNome() + " não se defendeu");
    }
}
