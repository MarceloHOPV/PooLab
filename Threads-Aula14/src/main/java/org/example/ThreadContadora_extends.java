package org.example;

public class ThreadContadora_extends extends Thread {

    String nome;
    int intervalo;

    public ThreadContadora_extends(String nome,int intervalo) {
        this.nome = nome;
        this.intervalo = intervalo;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.nome + "-" + i);
            try {
                Thread.sleep(this.intervalo);
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

    }

}
