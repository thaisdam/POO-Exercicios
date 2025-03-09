//ConcreteHandler

public class Manipulador05 extends Manipulador{

    public void escolherManipulador(double diametro) {

        double valor = 0.05;

        if (diametro != 1.2 && getSucessor() != null) {
            getSucessor().escolherManipulador(diametro);
            System.out.println("R$" + valor);
        }
    }
}

