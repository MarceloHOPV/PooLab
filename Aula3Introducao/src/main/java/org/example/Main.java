package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Funcionario F1 = new Funcionario("Marcelo",1111111,21,1400);
        Funcionario F2 = new Funcionario("Luís",200000,20,500);

        System.out.println(F1.nome);
        System.out.println(F1.cpf);
        System.out.println(F1.idade);
        System.out.println(F1.salario);
        System.out.println(F2.nome);
        System.out.println(F2.cpf);
        System.out.println(F2.idade);
        System.out.println(F2.salario);

        F2.tirarFerias("Dezembro",2);
        System.out.println(F1.salarioanul());
        System.out.println(F1.salarioanul(1500));

    }
}