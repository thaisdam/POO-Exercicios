
public class ContaSalario extends TipoConta{
    
    public ContaSalario(){

        setStrategyRentabilidade(new StrategySemRentabilidade());
        setStrategyMensalidade(new StrategySemMensalidade());
        setStrategyMovimentacao(new StrategyMovimentacaoSimplificada());
        setStrategyLimite(new StrategySemLimite());


    }
}
