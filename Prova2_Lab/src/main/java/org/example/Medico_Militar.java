package org.example;

public class Medico_Militar extends Soldado implements Curar{
    private int anosEsperiencia;
    private  int capacidadeEmergencia;

    public Medico_Militar(String nome, long cpf, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
        if(this.IE != null)
            capacidadeEmergencia += 100;
    }

    @Override
    public void curar() {

    }
}
