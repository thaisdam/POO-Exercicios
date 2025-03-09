public class Main {
    public static void main(String[] args) {


        FormasGeometricas formasGeometricas = new Circulo();
        formasGeometricas = new Luz(formasGeometricas);
        formasGeometricas = new Sombreamento(formasGeometricas);
        formasGeometricas.desenhar();

    }
}
