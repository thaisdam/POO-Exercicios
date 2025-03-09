//ConcreteHandler


public class Manipulador100 extends Manipulador{

    public void escolherManipulador(double diametro) {

        double valor = 1.00;

        if (diametro == 1.8 && getSucessor() != null) {
            getSucessor().escolherManipulador(diametro);
            System.out.println("R$" + valor + "0");
        }

    }
}
