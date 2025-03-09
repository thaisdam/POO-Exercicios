class EstadoS2 extends Estado {
    public EstadoS2(Automato automato) {
        super(automato);
    }

    public void setLimites() {
        this.setLimiteInferior("'a'");
        this.setLimiteSuperior("b");
        this.setLimiteProximo("a");

    }


    public void verificarAlteracaoEstado() {
        if (this.getAutomato().getPalavra().equals(this.getLimiteInferior())){
            this.getAutomato().setEstado(new EstadoS2(getAutomato()));
            verificarAlteracaoEstado();
        } else   if (this.getAutomato().getPalavra().equals(this.getLimiteSuperior())){
            this.getAutomato().setEstado(new EstadoS4(getAutomato()));
         verificarAlteracaoEstado();
        }
       else if (this.getAutomato().getPalavra().equals(this.getLimiteProximo())){
            this.getAutomato().setEstado(new EstadoS1(getAutomato()));
           verificarAlteracaoEstado();
        }
    }
    public void testarCadeia(String palavra) {
        System.out.println("Rejeita cadeia");
        verificarAlteracaoEstado();
    }
}

