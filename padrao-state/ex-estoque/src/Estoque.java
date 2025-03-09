public class Estoque {

    private Estado estado;
    private int quantidade;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque() {
    this.estado = new EstadoIndisponivel(this);
     this.quantidade = 0;
}

    public void vendaEstoque(int quantidade) {
        estado.vendaEstoque(quantidade);
        System.out.println("Quantidade vendida = " + quantidade);
        System.out.println("Quantidade depois da venda = " + this.getQuantidade());
        System.out.println("Estado = " + this.estado.getClass().getName());
    }

    public void compraEstoque(int quantidade) {
        estado.compraEstoque(quantidade);
        System.out.println("Quantidade comprada = " + quantidade);
        System.out.println("Quantidade depois da compra = " + this.getQuantidade());
        System.out.println("Estado = " + this.estado.getClass().getName());
    }

}
