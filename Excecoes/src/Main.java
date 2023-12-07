// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Conta C = new Conta(200,500,666);
        Cliente cl1 = new Cliente("Raphael",1);
        Cliente cl2 = new Cliente("Michelangelo",2);
        Cliente cl3 = new Cliente("Donatello",3);

        C.cls.add(cl1);
        C.cls.add(cl2);
        C.cls.add(null);

        C.mostraInfo();


    }
}