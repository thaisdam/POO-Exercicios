//ConcreteHandler


public class Manipulador10 extends Manipulador{

    public void escolherManipulador(double diametro) {

        double valor = 0.10;

        if ( diametro != 1.4 && getSucessor() != null) {
            getSucessor().escolherManipulador(diametro);
            System.out.println("R$" + valor + "0");
        }

    }
}
