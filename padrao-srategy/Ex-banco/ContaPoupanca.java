
public class ContaPoupanca extends TipoConta{
    public ContaPoupanca(){
        setStrategyRentabilidade(new StrategyComRentabilidade());
        setStrategyMensalidade(new StrategySemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoSimplificada());
        setStrategyLimite(new StrategySemLimite());
    }
}
