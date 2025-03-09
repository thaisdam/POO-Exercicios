//ConcreteDecorator
public class Luz extends FormasGeometricasDecorador {
    public Luz(FormasGeometricas formasGeometricasDecorado) {
        super(formasGeometricasDecorado);
        setDescricao("Luz");
    }

    @Override
    public void desenhar() {
        super.desenhar();
    }
}


