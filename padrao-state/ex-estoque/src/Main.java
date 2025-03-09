public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.compraEstoque(0);
        estoque.compraEstoque(5);
        estoque.compraEstoque(50);
        estoque.vendaEstoque(45);
        estoque.compraEstoque(10);
        estoque.vendaEstoque(21);
    }
}
