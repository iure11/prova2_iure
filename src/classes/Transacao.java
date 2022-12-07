package classes;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transacao {

    private List<Movimento>  movimentos = new ArrayList<>();

    public Transacao() {
    }
    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao) {
        if (conta == null) {
            return false;

        } else {
            Movimento mov = new Movimento(data, conta, historico, valor, operacao);
            movimentos.add(mov);
            return mov.movimentar(conta.getSaldo());
        }
    }
//    public void estornarTransacao() {
//        for (int i=0; i<movimentos.size();i++){
//            movimentos.set(i, null);
//        }
//    }

    public void getMovimentos() {
        for (Movimento movimento : movimentos){
            System.out.println("Data: "+movimento.getData());
            System.out.println("Histórico: "+movimento.getHistorico());
            System.out.println("Valor: "+movimento.getValor());
            if (movimento.getOperacao()==0){
                System.out.println("Operação: Saque");

            }else if(movimento.getOperacao()==1){
                System.out.println("Operação: Depósito");
            }
            System.out.println("------------------------------");
        }
    }
}
