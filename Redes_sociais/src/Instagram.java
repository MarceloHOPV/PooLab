public class Instagram extends  RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagran");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagran");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma comentario no Instagran");
    }

}
