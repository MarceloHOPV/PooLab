package org.example;

public class Pokemon {

    static public int qtdPokemon;
    private String nome;
    private String tipo;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
    }

    void mostraInfo(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);

    }

    void atacar()
    {
        System.out.println("O pokemon " + this.nome + " atacou");
    }

}
