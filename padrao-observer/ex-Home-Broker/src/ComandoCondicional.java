//Concrete composite


public class ComandoCondicional extends TipoComando {

    public ComandoCondicional(ComandoSimples comandoSimples, ComandoSimples comandoSimples2) {
        super(comandoSimples);
    }

    public String exexuta() {


        if (Math.random() < 0.5) {

            System.out.println("Comando Condicional: if ");
        }
           if(Math.random() > 0.5) {
               System.out.println("Comando Condicional: else");
        }
            return getTipo().exexuta();
        }

    }

