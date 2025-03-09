class EstadoS3 extends Estado {
    public EstadoS3(Automato automato) {
        super(automato);
    }

    public void setLimites() {
        this.setLimiteInferior("b");
        this.setLimiteSuperior("a");
    }


    public void verificarAlteracaoEstado() {
        if (this.getAutomato().getPalavra().equals(this.getLimiteInferior()));
        this.getAutomato().setEstado(new EstadoS4(this.getAutomato()));
        this.getAutomato().getEstado().verificarAlteracaoEstado();
         if (this.getAutomato().getPalavra().equals(this.getLimiteSuperior())) {
            this.getAutomato().setEstado(new EstadoS1(this.getAutomato()));
             this.getAutomato().getEstado().verificarAlteracaoEstado();
         }
    }
    public void testarCadeia(String palavra) {
        System.out.println("Rejeita cadeia");
        this.verificarAlteracaoEstado();
    }

}
