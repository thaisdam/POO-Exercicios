public class Main {
    public static void main(String[] args) {

        Automato a = new Automato();
       //1 aceita
        a.testarCadeia("aaacdb");

        //2 aceita
        Automato b = new Automato();
        b.testarCadeia("ababacdaaac");

        //3 nao aceita
        Automato c = new Automato();
        c.testarCadeia("abcdb");

        //4 nao aceita
        Automato d = new Automato();
        d.testarCadeia("acda");

        //5 aceita
        Automato e = new Automato();
        e.testarCadeia("acdbdb");


    }
}
