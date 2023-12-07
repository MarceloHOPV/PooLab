public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartinlhar() {
        System.out.println("Compartilhou cum post no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Potou um vídeo no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario de ódio no Twitter");
    }
}
//obs: twitter n existe mais