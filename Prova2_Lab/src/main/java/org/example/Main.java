package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ItemEspecial I1 = new ItemEspecial("Fogo");
        ItemEspecial I2 = new ItemEspecial("agua");
        ItemEspecial I3 = new ItemEspecial("terra");

        Oficial of = new Oficial("Anna",1,"monitora");
        Sargento sc = new Sargento("Marcelo", 1,"bem",2);
        Medico_Militar m = new Medico_Militar("Pedro",2,12,2);
        Exercito ex = new Exercito("caveira");
        of.IE = I1;
        sc.IE = I2;
        m.IE = I3;

        ex.addSoldado(of);
        ex.addSoldado(sc);
        ex.addSoldado(m);

        ex.mostraInfo();

        System.out.println("===========================================================");
        for (Soldado s: ex.getSd()) {
            if(s != null)
            {
                if(s instanceof Sargento)
                {
                    System.out.println("O sargente " + s.getNome());
                    Sargento sargento = (Sargento)s;
                    sargento.defender();
                    sargento.usandoItem();
                }
                if(s instanceof Oficial)
                {
                    System.out.println("A oficial " + s.getNome());
                    Oficial ofic = (Oficial) s;
                    ofic.defender();
                    ofic.usandoItem();
                }
                if(s instanceof Medico_Militar)
                {
                    System.out.println("O medico " + s.getNome());
                    Medico_Militar medico = (Medico_Militar) s;
                    medico.curar();
                    medico.usandoItem();
                }
            }
        }

        System.out.println("Existem " + Soldado.qtdSoldado + " soldados");

    }


}