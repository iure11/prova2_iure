package classes;

public class Restricoes {

    public class restricoes extends Exception {
        private int saque;
        private float saldo;


    }
    public void sacaInvalido (){
        System.out.println("Saldo Invalido!");
    }
}
