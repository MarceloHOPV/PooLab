public class GooglePlus extends RedeSocial implements Compartilhamento,VideoConferencia{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartinlhar() {
        System.out.println("Compartilhou uma série do google pluss");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Google plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google plus");
    }

    @Override
    public void curtitPublicacao() {
        super.curtitPublicacao();
        System.out.println("Curtiu uma publicação no Google plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Viu um streaminh no Google plus");
    }
}
