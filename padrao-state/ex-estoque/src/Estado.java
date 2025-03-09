public abstract class Estado {

    private Estoque estoque;
    private int limiteInferior;
    private int limiteSuperior;

    public Estado(Estoque estoque) {
        this.estoque = estoque;
        setLimites();
    }

    protected abstract void setLimites();

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }



    public void vendaEstoque(int quantidade) {
        this.estoque.setQuantidade(this.estoque.getQuantidade() - quantidade);
        this.verificarAlteracaoEstado();
    }


    public void compraEstoque(int quantidade) {
        this.estoque.setQuantidade(this.estoque.getQuantidade() + quantidade);
        this.verificarAlteracaoEstado();
    }


    protected abstract void verificarAlteracaoEstado();
}