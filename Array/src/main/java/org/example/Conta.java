package org.example;

public class Conta {

    String dono;
    double saldo;

    void mostrarAtributos(){
        System.out.println("--------------");
        System.out.println(dono);
        System.out.println(saldo);
    }

    public Conta(String dono, double saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }
}
