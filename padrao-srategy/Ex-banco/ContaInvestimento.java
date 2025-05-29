
public class ContaInvestimento extends TipoConta{
    public ContaInvestimento(){

        setStrategyRentabilidade(new StrategyComRentabilidade());
        setStrategyMensalidade(new StrategySemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoCompleta());
        setStrategyLimite(new StrategySemLimite());

    }
}
