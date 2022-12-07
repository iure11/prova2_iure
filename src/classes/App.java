package classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean c = true;
// usuario e senha são "fulano", "1010"

        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setCpf("155.555.999-10");
        cliente.setSenha("1010");
        Conta conta = new Conta();
        conta.setNumero(0000);
        conta.setSaldo(100.0f);
        float saldo = conta.getSaldo();
        Transacao transacao = new Transacao();
        transacao.realizarTransacao("10-10-2020", conta,"Salario", 20.0f, Conta.depositar);
        transacao.realizarTransacao("10-10-2020", conta,"Pensão", 200.0f, Conta.sacar);
        System.out.println("Deseja imprimir o relatorio? ");
        char resp = s.next().charAt(0);
        s.nextLine();
        if (resp == 's'){
        while (c){
            System.out.println("Qual o usuario e senha?");
            String usuario = s.nextLine();
            String senha = s.nextLine();
            if (usuario.equals(cliente.getNome()) && senha.equals(cliente.getSenha())){
                c = false;
            }
            else {
                System.out.println("User e senha incorretos, tente novamente!");

            }
        }
            System.out.println("Emitindo extrato da conta comum número: " + conta.getNumero());
            System.out.println("Correntista: " + cliente.getNome());
            System.out.println("Saldo Anterior: " + saldo);
            System.out.println("------------------------------");
            transacao.getMovimentos();
            System.out.println("Saldo Atual: " + conta.getSaldo());
        }
    }
}
