package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pokemon s = new Squirtle("Vegeta","Saiyajin",7999);
        Pokemon n = new Bulbassaur("Piccolo","nanico zedin",7);
        Pokemon p = new Pikachu("Goku", "Saiyajin",8001,8001);

        Pokemon s1;
        Pokemon n1;
        Pokemon p1;

        s1 = (Squirtle) s;
        n1 = (Bulbassaur) n;
        p1 = (Pikachu) p;

        s1.mostraInfo();
        s1.atacar();
        System.out.println();
        n1.mostraInfo();
        n1.atacar();
        System.out.println();
        p1.mostraInfo();
        p1.atacar();

    }
}