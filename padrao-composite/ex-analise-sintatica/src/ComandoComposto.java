// Concrete Composite

import java.util.ArrayList;
import java.util.List;
import java.lang.String;


public class ComandoComposto extends TipoComando
{


    public ComandoComposto(Comando tipo){
        super(tipo);
    }

    List <ComandoSimples> tipo = new ArrayList<>(){{
        add(new ComandoSimples("Comandos"));

        }};



    public String exexuta(){
        List<String> bloco = new ArrayList<>();

        bloco.add("Comando 1");
        bloco.add("Comando 2");
        bloco.add("Comando 3");

        System.out.println(bloco);

        return getTipo().exexuta();
    }

    }

