public class Main {
    public static void main(String[] args){


       System.out.println("Moeda inserida: ");
        //instanciar objetos da cadeia
        Manipulador moeda100 = new Manipulador100();
        Manipulador moeda50 = new Manipulador50();
        Manipulador moeda10 = new Manipulador10();
        Manipulador moeda05 = new Manipulador05();
        Manipulador moeda01 = new Manipulador01();

        //criar cadeia – encadear os objetos da cadeia
        moeda100.setSucessor(moeda50);
        moeda50.setSucessor(moeda10);
        moeda10.setSucessor(moeda05);
        moeda05.setSucessor(moeda01);
        moeda01.setSucessor(null);

        //teste moeda com diametro nao reconhecido
        moeda100.escolherManipulador(1.5);

       //teste moedas inseridas
       moeda100.escolherManipulador(1.8);
       moeda100.escolherManipulador(1.6);
       moeda100.escolherManipulador(1.4);
       moeda100.escolherManipulador(1.2);
       moeda100.escolherManipulador(1);



    }
}
