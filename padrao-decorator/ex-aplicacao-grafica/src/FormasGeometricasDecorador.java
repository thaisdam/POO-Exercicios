//Decorador
public abstract class FormasGeometricasDecorador extends FormasGeometricas {
    private FormasGeometricas formasGeometricasDecorado;

    public FormasGeometricasDecorador(FormasGeometricas formasGeometricasDecorado) {
        this.formasGeometricasDecorado = formasGeometricasDecorado;
    }
   public String getDescricao() {
        return formasGeometricasDecorado.getDescricao() + ", "+ super.getDescricao();
    }

}