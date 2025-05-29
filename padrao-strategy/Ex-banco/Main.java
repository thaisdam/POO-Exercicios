
public class Main {
    public static void main(String args[]){

        System.out.println("Conta Corrente: ");
        TipoConta cc = new ContaCorrente();
      //    cc.setCliente ("  ");
      //    cc.getSaldo(1000.0);
      //    cc.setNumero(45685);
      //    cc.setSenha("dddffrf");
        cc.rentabilidade();
        cc.mensalidade();
        cc.movimentacao();
        cc.limite();
      //  System.out.println("numero da conta: " + cc.getNumero());
      //  System.out.println("nome do cliente: " + cc.getCliente());
      //  System.out.println("saldo: " + cc.getSaldo());


        System.out.println("Conta Salario: ");
        TipoConta cs = new ContaSalario();
        cs.rentabilidade();
        cs.mensalidade();
        cs.limite();
        cs.movimentacao();

        System.out.println(("Conta Poupança: "));
        TipoConta cp = new ContaPoupanca();
        cp.rentabilidade();
        cp.mensalidade();
        cp.movimentacao();
        cp.limite();

        System.out.println("Conta Investimento: ");
        TipoConta ci = new ContaInvestimento();
        ci.rentabilidade();
        ci.mensalidade();
        ci.movimentacao();
        ci.limite();


    }
}
