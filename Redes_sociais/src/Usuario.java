public class Usuario {

    private String nome;
    private String email;

    RedeSocial []rd = new RedeSocial[2];

    public Usuario(String nome, String email,RedeSocial r1, RedeSocial r2) {
        this.nome = nome;
        this.email = email;
        rd[0] = r1;
        rd[1] = r2;
    }

}
