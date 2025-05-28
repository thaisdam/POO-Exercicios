public class ContaCorrente extends TipoConta {

    public ContaCorrente() {

    setStrategyRentabilidade(new StrategyNaoTemRentabilidade());

    setStrategyMensalidade(new StrategyTemMensalidade());

    setStrategyMovimentacao(new StrategyMovimentacaoCompleta());

    setStrategyLimite(new StrategyTemLimite());
}

}