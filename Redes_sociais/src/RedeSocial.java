public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;
     public abstract void postarFoto();
     public abstract void postarVideo();
     public abstract void postarComentario();
     public void curtitPublicacao(){
     }

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

}