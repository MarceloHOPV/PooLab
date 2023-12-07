package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Duas coisas distintas que podem acontecer ao mesmo tempo
            //existe um limite de quantidade de threads
            //Duas formas de fazer threads: Por interface e por herança

        ThreadContadora tc1 = new ThreadContadora("Thread 1",500);
        ThreadContadora tc2 = new ThreadContadora("Thread 2",1000);
        ThreadContadora tc3 = new ThreadContadora("Thread 3",2000);

        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);

        t1.start();
        t2.start();
        t3.start();
        //por extends
        ThreadContadora_extends te1 = new ThreadContadora_extends("Thread extends 1",500);
        ThreadContadora_extends te2 = new ThreadContadora_extends("Thread extends 2",1000);
        ThreadContadora_extends te3 = new ThreadContadora_extends("Thread extends 3",2000);

        te1.start();
        te2.start();
        te3.start();

    }
}