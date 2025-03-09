//ConcreteHandler

public class Manipulador01 extends Manipulador {

    public void escolherManipulador(double diametro) {

        double valor = 0.01;

        if(diametro != 1)
            System.out.println("Moeda rejeitada");

        if (diametro == 1 && getSucessor() != null)
            getSucessor().escolherManipulador(diametro);
            System.out.println("R$" + valor);

    }
}
