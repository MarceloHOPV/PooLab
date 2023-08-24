package org.example;

public class Funcionario {

    String nome;
    int cpf;
    int idade;
    float salario;

    public void tirarFerias(String mes, int dias){
        System.out.println("O funcionário "+ nome + " tirou " + dias + " de férias no mês de "+mes);
    }

    public float salarioanul(){
        return 12*salario;
    }

    public float salarioanul(float decimoTerceiro){
        return 12*salario+decimoTerceiro;
    }

    public Funcionario(String nome, int cpf, int idade, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }
}
