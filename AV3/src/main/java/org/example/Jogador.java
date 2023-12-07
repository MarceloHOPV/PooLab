package org.example;

public class Jogador implements Comparable<Jogador>{
    private String nome;
    private int Numero;
    private String posicao;


    public Jogador() {
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return Numero;
    }

    public String getPosicao() {
        return posicao;
    }

    //Seters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        if(numero > 0){
            try {
                Numero = numero;
                throw new excessao();
            }catch (excessao e){
            }

        }
    }

    public void setPosicao(String posicao) {
        if(posicao.equals("Goleiro") || posicao.equals("Atacante") || posicao.equals( "Zagueiro"))
                this.posicao = posicao;
        else{
            try{
                throw new excessao();
            }catch (excessao e){}
        }

    }

    @Override
    public int compareTo(Jogador o) {
        return Integer.compare(this.getNumero(),o.getNumero());
    }

}
