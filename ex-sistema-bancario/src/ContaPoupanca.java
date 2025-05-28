public class ContaPoupanca extends TipoConta{
     ContaPoupanca(){
        setStrategyRentabilidade(new StrategyTemRentabilidade());
        setStrategyMensalidade(new StrategyNaoTemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoSimplificada());
        setStrategyLimite(new StrategyNaoTemLimite());

    }
}
