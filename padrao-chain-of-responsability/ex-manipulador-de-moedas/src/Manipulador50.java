//ConcreteHandler


public class Manipulador50 extends Manipulador{

    public void escolherManipulador(double diametro) {

        double valor = 0.50;

        if ( diametro != 1.6 && getSucessor() != null) {
            getSucessor().escolherManipulador(diametro);
            System.out.println("R$" + valor + "0");
        }
    }
}
