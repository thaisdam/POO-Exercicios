import static java.lang.System.exit;

public class EstadoDisponivel extends Estado {

    public EstadoDisponivel(Estoque estoque) {
        super(estoque);
    }

    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(10);
    }


    public void verificarAlteracaoEstado() {

        if (this.getEstoque().getQuantidade() < 0) {
            System.out.println("Estoque insuficiente.");
            exit(0);
        }
        if (this.getEstoque().getQuantidade() <= this.getLimiteSuperior()) {
            this.getEstoque().setEstado(new EstadoCritico(this.getEstoque()));
            this.getEstoque().getEstado().verificarAlteracaoEstado();
            System.out.println("Estoque baixo");
        }
    }
}