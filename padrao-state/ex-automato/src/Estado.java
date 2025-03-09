//state
 public abstract class Estado {
    private Automato automato;
    private String limiteInferior;
    private String limiteSuperior;
    private String limiteProximo;

    public Estado(Automato automato) {
        this.setAutomato(automato);
        setLimites();
    }
    protected abstract void setLimites();
    public Automato getAutomato() {
        return automato;
    }

    public void setAutomato(Automato automato) {
        this.automato = automato;
    }

    public String getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(String limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public String getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(String limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public String getLimiteProximo() {
        return limiteProximo;
    }

    public void setLimiteProximo(String limiteProximo) {
        this.limiteProximo = limiteProximo;
    }


    public void testarCadeia(String palavra) {
        this.automato.setPalavra(this.automato.getPalavra() + palavra);
        this.verificarAlteracaoEstado();
    }
    protected abstract void verificarAlteracaoEstado();


}