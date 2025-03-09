class EstadoS4 extends Estado {
    public EstadoS4(Automato automato) {
        super(automato);
    }

    public void setLimites() {
        this.setLimiteInferior("a");

    }



    public void verificarAlteracaoEstado() {
        if (this.getAutomato().getPalavra().equals(this.getLimiteInferior()));
        this.getAutomato().setEstado(new EstadoS3(this.getAutomato()));
        this.getAutomato().getEstado().verificarAlteracaoEstado();
    }
    public void testarCadeia(String palavra) {
        System.out.println("Aceita cadeia");
        this.verificarAlteracaoEstado();
    }
}