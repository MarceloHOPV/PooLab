package org.example;

public class Exercito {
    private String nome;
    private Soldado[] sd = new Soldado[3];

    public Exercito(String nome) {
        this.nome = nome;
    }

    void addSoldado(Soldado S)
    {
        for (int i = 0; i < 3; i++) {
                if (S instanceof Sargento)
                    sd[0] = S;
                else if (S instanceof Oficial)
                    sd[1] = S;
                else if (S instanceof Medico_Militar)
                    sd[2] = S;
        }
    }

    void mostraInfo()
    {
        for (Soldado s:sd) {
            if(s != null)
                s.mostraInfo();
        }
    }

    public Soldado[] getSd() {
        return sd;
    }
}
