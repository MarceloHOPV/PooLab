package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Nave nv = new Nave();
        Arma pewpew = new Arma();

        nv.velocidade = 1000;
        nv.nome = "louren";
        pewpew.poder = 100;
        pewpew.tipo = "fogo";

        nv.mostraInfo();
        nv.adicionarArma(pewpew);//Agregação


        Nave_Composição nave = new Nave_Composição("powpow",200,pewpew);//Composição

        System.out.println(nave.nome);
        System.out.println(nave.velocidade);
        System.out.println(nave.arma.poder);
        System.out.println(nave.arma.tipo);



    }
}