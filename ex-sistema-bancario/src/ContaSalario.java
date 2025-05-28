public class ContaSalario extends TipoConta{
    public ContaSalario(){

        setStrategyRentabilidade(new StrategyNaoTemRentabilidade());
        setStrategyMensalidade(new StrategyNaoTemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoSimplificada());
        setStrategyLimite(new StrategyNaoTemLimite());


    }
}

