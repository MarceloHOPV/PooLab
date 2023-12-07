// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Facebook fb;
        GooglePlus gp;
        Twitter tw;
        Instagram ins;
        Facebook f1 = new Facebook("123",0);
        GooglePlus g1 = new GooglePlus("123",0);
        Twitter t2 = new Twitter("321",1);
        Instagram i2 = new Instagram("3141592653589",22);

        Usuario u1 = new Usuario("Marcelo","OlecramarcelO@gmail.com",f1,g1);
        Usuario u2 = new Usuario("Canellas","brenno.canellas.from.brasil@gmail.com",t2,i2);

        System.out.println();
        System.out.println("Marcelo está em suas redes sociais:");
        fb = (Facebook)u1.rd[0];
        u1.rd[0].curtitPublicacao();
        fb.fazStreaming();
        fb.compartinlhar();
        u1.rd[1].postarVideo();
        u1.rd[1].postarFoto();
        u1.rd[1].postarComentario();
        System.out.println();
        //Não intendi direito a parte de cada rede social deve executar 3 metodos diferente pq n tem pra todos mas eu fiz aqui em cima usando diferentes
        System.out.println("Brenno está em suas redes sociais:");
        u2.rd[0].postarComentario();
        u2.rd[0].postarFoto();
        u2.rd[0].postarVideo();
        u2.rd[1].postarVideo();
        u2.rd[1].curtitPublicacao();
        u2.rd[1].postarFoto();
        System.out.println();
    }
}