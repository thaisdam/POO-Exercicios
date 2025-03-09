// "Context"
class Automato {
    private Estado estado;
    private String palavra;


    public Automato () {
        this.palavra = " ";
        this.estado = new EstadoS1(this);
      //  this.palavra = "a";
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void testarCadeia(String palavra) {
        getEstado().testarCadeia(palavra);
        System.out.println("Palavra = " + palavra);
        System.out.println("Estado = " + this.getEstado().getClass().getName());
    }


}