package org.example;

public class Pikachu extends Pokemon{

    float soltarRaios;
    float paralisiaEletrica;

    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;

    }

    @Override
    void atacar() {
        super.atacar();
        System.out.println("E seu ataque de raio foi surpreendente");
    }
}
