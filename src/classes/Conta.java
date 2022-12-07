package classes;


import java.util.Scanner;

public class Conta {
    Scanner s = new Scanner(System.in);
    private int numero;
    private Cliente correntista;
    private float saldo;



    final static int sacar = 0;
    final static int depositar = 1;

    public Conta(int numero, float saldo, Cliente correntista) {
        this.numero = numero;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public Conta() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public void depositar(float valor) {
        setSaldo(getSaldo() + valor);

    }
    private Restricoes re = new Restricoes();

    public void sacar(float valor) {
        try {
            if (saldo < valor) {
                throw new Exception();
            } else {
                setSaldo(getSaldo() - valor);
            }

        } catch (Exception ec) {
            re.sacaInvalido();
            System.out.println("Deseja sacar outro valor?");
            String op = s.next().toUpperCase();
            if (op.equals("S")) {
                System.out.println("Insira o valor do saque:");
                float v = Float.parseFloat(s.next());
                sacar(v);
            } else {
            }
        }
    }

    public boolean movimentar(float valor, int numero) {
        if (numero == Conta.sacar) {
            sacar(valor);
            return true;
        } else if (numero == Conta.depositar) {
            depositar(valor);
            return true;
        } else {
            return false;
        }

    }
}


