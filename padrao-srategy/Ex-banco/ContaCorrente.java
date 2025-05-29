
public class ContaCorrente extends TipoConta {

    public ContaCorrente() {


    setStrategyRentabilidade(new StrategySemRentabilidade());

    setStrategyMensalidade(new StrategyComMensalidade());

    setStrategyMovimentacao(new StrategyMovimentacaoCompleta());

    setStrategyLimite(new StrategyComLimite());
}

}
