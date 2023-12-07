package org.example;

public abstract class Soldado {

    public static  int qtdSoldado = 0;
    private String nome;
    private long cpf;
    ItemEspecial IE;

    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado++;
    }

    void mostraInfo(){
        System.out.println("[------------------------------------]");
        System.out.println("Nome do soldado: " + nome);
        System.out.println("CPF do soldado: " + cpf);
        if(IE != null)
            System.out.println("Possui a arma especial do tipo " + IE.Tipo);
        else
            System.out.println("Não possui arma especial");
    }

    void usandoItem()
    {
        if(IE != null)
            System.out.println(nome + " utilizando item especial");
        else
            System.out.println(nome + " não tem item especial para utilizar");
    }

    public String getNome() {
        return nome;
    }
}
