public class Main {
    public static void main(String[] args) throws InterruptedException {

        Acoes acao1 = new Acoes (1);
        Variacoes emp1 = new Variacoes("A", 15);
        Variacoes emp2 = new Variacoes("B",-20);
        Variacoes emp3 = new Variacoes("C", 5);

        Acoes acao2 = new Acoes (2);
        Variacoes emp4 = new Variacoes( "D",-8);
        Variacoes emp5 = new Variacoes("E",-7);
        Variacoes emp6 = new Variacoes("F",-1);
        Variacoes emp7 = new Variacoes("G",2);

        acao1.addObserver(emp1);
        acao1.addObserver(emp2);
        acao1.addObserver(emp3);
        acao2.addObserver(emp4);
        acao2.addObserver(emp5);
        acao2.addObserver(emp6);
        acao2.addObserver(emp7);

        while(true){

           acao1.show();
           acao2.show();
           Thread.sleep(300);

        }

    }
}

