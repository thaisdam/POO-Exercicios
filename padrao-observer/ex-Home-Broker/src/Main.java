public class Main {
    public static void main(String[] args) {

        Comando e = new ComandoSimples("Simples");
        System.out.println(e.exexuta());


        e = new ComandoCondicional(new ComandoSimples("Condicional"), new ComandoSimples("Condicional"));
        System.out.println(e.exexuta());

        e = new ComandoCondicional(new ComandoSimples("Condicional"), new ComandoSimples("Condicional"));
        System.out.println(e.exexuta());

        e = new ComandoComposto (new ComandoComposto(new ComandoSimples("Composto")));
        System.out.println(e.exexuta());
    }
}
