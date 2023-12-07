
import java.util.HashSet;
import java.util.Set;

public class Conta {

    private double saldo;
    private double limite;
    private int numero;
    Set<Cliente> cls = new HashSet<Cliente>();
    void mostraInfo()
    {
        System.out.println("Informações da conta: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Clientes na conta:");
        for (Cliente c:cls) {
            try {
                c.mostraInfo();
            }catch (NullPointerException e)
            {
                System.out.println("Erro: " + e);
            }

        }

    }

    public Conta(double saldo, double limite, int numero) {
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }

}
