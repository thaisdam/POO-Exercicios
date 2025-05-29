
public class TipoConta {

    private int numero;
    private String senha;
    private double saldo;
    private String cliente;



    private StrategyRentabilidade r;
    private StrategyLimite l;
    private StrategyMovimentacao mo;
    private StrategyMensalidade me;


    public void setStrategyRentabilidade( StrategyRentabilidade r) { this.r = r; }
    public void setStrategyLimite(StrategyLimite l) { this.l = l; }
    public void setStrategyMovimentacao(StrategyMovimentacao mo) { this.mo = mo; }
    public void setStrategyMensalidade(StrategyMensalidade me) {this.me = me; }

    public void rentabilidade() { this.r.rentabilidade(); }
    public void limite() { this.l.limite(); }
    public void movimentacao() {this.mo.movimentacao(); }
    public void mensalidade() {this.me.mensalidade();}


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

 
}

