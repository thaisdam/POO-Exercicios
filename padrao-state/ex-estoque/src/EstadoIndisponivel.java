public class EstadoIndisponivel extends Estado {

    public EstadoIndisponivel(Estoque estoque) {
        super(estoque);
    }

    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(10);
    }


    public void verificarAlteracaoEstado() {
        if (this.getEstoque().getQuantidade() > this.getLimiteInferior()){
            this.getEstoque().setEstado(new EstadoCritico(this.getEstoque()));
            this.getEstoque().getEstado().verificarAlteracaoEstado();
            System.out.println("Estoque Baixo");
        }
    }
    }

