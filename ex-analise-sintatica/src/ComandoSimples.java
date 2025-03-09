//Leaf


public  class ComandoSimples implements Comando
{
    private String conteudo;


    public ComandoSimples(String conteudo){
        this.conteudo = conteudo;
    }
    public String exexuta(){
        System.out.println("Nome do comando: ");
        return this.conteudo;
    }

}

