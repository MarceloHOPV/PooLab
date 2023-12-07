package org.example;

public class Squirtle extends Pokemon{

    float multiplicadorAgua;

    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    @Override
    void atacar() {
        super.atacar();
        System.out.println("E seu ataque de agua foi surpreendente");
    }
}
