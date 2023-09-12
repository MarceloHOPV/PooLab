package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int []tst = new int[5];

       Conta []continhas = new Conta[5];
       //primeira forma igualando c1 a contrinhas[0]
        Conta c1 = new Conta("Luiz",1004.40);
        continhas[0] = c1;
        //segunda forma instanciando diretamente continhas[1]
        continhas[1] = new Conta("Victor",100.35);
        //====================================================================================================================
        for (Conta c:continhas) {//Não é recomendado pq não tem indice e precisamos dele para percorrer e não entrar nos null
            if(c == null)
                break;
            c.mostrarAtributos();
        }

    }
}