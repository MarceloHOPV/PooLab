package org.example;

public class Bulbassaur extends Pokemon {

    float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    void atacar() {
        super.atacar();
        System.out.println("E seu ataque de grama foi surpreendente");
    }
}
