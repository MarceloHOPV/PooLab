package org.example;

public class Teste {

    //Quando um atributo é static, ele não é um atributo do objeto, ele é um atributo da classe
    public static int qtd;//Começa com 0 por padrão

    public Teste() {

        qtd++;
            System.out.println("Foi criado " + qtd + " teste(s)");

    }
}
