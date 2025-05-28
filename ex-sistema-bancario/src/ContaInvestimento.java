public class ContaInvestimento extends TipoConta{
    public ContaInvestimento(){

        setStrategyRentabilidade(new StrategyTemRentabilidade());
        setStrategyMensalidade(new StrategyNaoTemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoCompleta());
        setStrategyLimite(new StrategyNaoTemLimite());

    }
}

/*
public class ContaInvestimento
{
    private int numero;
    private String senha;
    private int saldo;
    private String cliente;
    private StrategyRentabilidade r;
    private StrategyLimite l;
    private StrategyMovimentacao mo;
    private StrategyMensalidade me;



    public ContaInvestimento(){
        this.r = new StrategyNaoTemRentabilidade();
        this.me = new StrategyNaoTemMensalidade();
        this.mo = new StrategyMovimentacaoCompleta();
        this.l = new StrategyTemLimite();
    }

    public void setStrategyRentabilidade(StrategyRentabilidade r){
        this.r = r;
    }

    public void setStrategyMensalidade(StrategyMensalidade me){
        this.me = me;
    }
    public void setStrategyMovimentacao(StrategyMovimentacao mo){
        this.mo = mo;
    }
    public void setStrategyLimite(StrategyLimite l){
        this.l = l;
    }


    public void rentabilidade(){
        this.r.rentabilidade();

    }

    public void mensalidade(){
        this.me.mensalidade();

    }


    public void movimentacao(){
        this.mo.movimentacao();

    }

    public void limite(){
        this.l.limite();

    }

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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
*/
