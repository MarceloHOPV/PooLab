public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    void mostraInfo(){
        System.out.println("Os dados do ninja " + nome + " são:");
        System.out.println("Idade: " + idade);
        System.out.println("Título: " + titulo);
        System.out.println("Ranking: " + ranking);
    }
}
