//ConcreteDecorator
public class Sombreamento extends FormasGeometricasDecorador {
    public Sombreamento(FormasGeometricas formasGeometricasDecorado) {
        super(formasGeometricasDecorado);
        setDescricao("Sombreamento");
    }

    @Override
    public void desenhar() {
        super.desenhar();
    }
}
