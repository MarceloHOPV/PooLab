package org.example;

public class Escola {
    //Inicializando variaveis e objetos
    String Nome;
    String Diretor;
    Bruxo []bruxos = new Bruxo[100];
    //Adiciona o bruxo b por agregação à escola
    void adicionarBruxo(Bruxo b)
    {
        //for percorrendo os bruxos
        for (int i = 0; i < this.bruxos.length; i++) {
            //if pra ver se tem bruxo ou não
            if(this.bruxos[i] == null) {
                this.bruxos[i] = b;
                break;//break pra não continuar adicionando
            }
            }
    }

    //Mostra as informações da escola, como o aluno é uma informação da escola coloquei para mostrar os alunos e suas informações também
    void mostraInfo()
    {
        System.out.println("A escola " + this.Nome + " está sobre o controle do diretor " + this.Diretor);
        System.out.println("A escola " + this.Nome + " possui os seguintes alunos:");
        //for pra percorrer bruxos
        for (Bruxo b:bruxos) {
            //if pra não printar null
            if(b != null)
                b.mostraInfo();
        }
    }
    //Mostra quais são os jogadores de quadribol
    void jogadoresQua()
    {
        System.out.println("Os jogadores de quadribol de " + this.Nome + "são:");
        //for pra percorrer buxos
        for (Bruxo b:bruxos) {
            //if que filttra e não printa null
            if((b != null) && (b.Quadribol == true))//Podia simplificar aqui mas gosto de colocar o "== true"
                System.out.println(b.Nome);
        }
    }
    //Mostra quantas pessoas usam a varinha de cerejeira
    void varinhaCerejeira()
    {
        int cont = 0;
        //for pra percorrer bruxos
        for (Bruxo b:bruxos) {
            //if que filttra e não printa null
            if((b != null) && (b.Varinha.equals("Cerejeira")))
                cont++;
        }
        System.out.println("Existe(m) " + cont + " aluno(s) em " + this.Nome + " que utiliza(m) a Varinha de Cerejeira");
    }
    //Construtor para facilitar a nossa vida(sem instanciar Bruxo porque queremos usar agregação aqui)
    public Escola(String nome, String diretor) {
        this.Nome = nome;
        this.Diretor = diretor;
    }
}
