//Composite


public abstract class TipoComando implements Comando
{
    private Comando tipo;


    public TipoComando(Comando tipo)
    {
        this.tipo = tipo;

    }
    public Comando getTipo(){
        return this.tipo;
    }


}







