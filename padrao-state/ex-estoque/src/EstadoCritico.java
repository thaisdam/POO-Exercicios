

public class EstadoCritico extends Estado {

    public EstadoCritico(Estoque estoque) {
        super(estoque);
    }

    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(10);
    }


    public void vendaEstoque(int quantidade) {
        System.out.println("Estoque baixo");
    }

    public void verificarAlteracaoEstado() {

        if (this.getEstoque().getQuantidade() == this.getLimiteInferior()) {
            this.getEstoque().setEstado(new EstadoIndisponivel(this.getEstoque()));
        }
        if (this.getEstoque().getQuantidade() > this.getLimiteSuperior()) {
            this.getEstoque().setEstado(new EstadoDisponivel(this.getEstoque()));
               this.getEstoque().getEstado().verificarAlteracaoEstado();
        }

    }
}
