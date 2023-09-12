public class Aldeia {

    String nome;
    int qtdMoradores;
    String regiao;
    Ninja []ninjas = new Ninja[100];

    public Aldeia(String nome, int qtdMoradores, String regiao, Ninja[] ninjas) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
        this.ninjas = ninjas;
    }
    void mostraInfo(){
        System.out.println("A aldeia " + nome + " tem " + qtdMoradores + " moradores e fica na região " + regiao);
    }
    void adicionarNinja(Ninja ninja){
        for (int i = 0; i < ninjas.length; i++) {

            if(ninjas[i] == null) {
                this.ninjas[i] = ninja;
                break;
            }
        }
    }
    void rankingS(){
        System.out.println("Os ninjas a seguir tem ranking S");
        for (Ninja ninja: ninjas) {
            if(ninja != null){
            if(ninja.ranking.equals("S")) {
                System.out.println(ninja.nome);
            }
            }
        }
    }
    void qtdTitulos(){
        for (Ninja ninja: ninjas) {
            if(ninja != null) {
                int Gennin = 0, Chunnin = 0, ANBU = 0;
                if (ninja.titulo.equals("Gennin"))
                    Gennin++;
                if (ninja.titulo.equals("Chunnin"))
                    Chunnin++;
                if (ninja.titulo.equals("ANBU"))
                    ANBU++;
                System.out.println("Na vila existem os seguintes ninjas:");
                System.out.println("Gennin: " + Gennin);
                System.out.println("Chunnin: " + Chunnin);
                System.out.println("ANBU: " + ANBU);
            }
            }
    }
}