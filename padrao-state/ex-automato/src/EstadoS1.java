class EstadoS1 extends Estado {
    public EstadoS1(Automato automato) {
        super(automato);
    }

    public void setLimites() {
        this.setLimiteInferior("a");
    }


    public void verificarAlteracaoEstado() {
        if (this.getAutomato().getPalavra().equals(this.getLimiteInferior()));
        this.getAutomato().setEstado(new EstadoS2(this.getAutomato()));
        this.getAutomato().getEstado().verificarAlteracaoEstado();
    }

    public void testarCadeia(String palavra) {
        System.out.println("Rejeita cadeia");
        this.verificarAlteracaoEstado();
    }

}