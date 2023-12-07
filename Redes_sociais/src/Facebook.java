public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartinlhar() {
        System.out.println("Compartilhou um post no facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Facebook");
    }
    @Override
    public void curtitPublicacao() {
        super.curtitPublicacao();
        System.out.println("curtiu uma pu-blicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Facebook");
    }
}
