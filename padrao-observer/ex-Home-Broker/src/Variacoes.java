

public class Variacoes implements Observador {
    private int valor;
    private String ativo;


    public  Variacoes(String ativo, int valor) {
        this.valor = valor;
    }


    public void update(Sujeito s) {

        Acoes acoes = (Acoes) s;

        if (((this.valor - acoes.getValor()) == 0)) {


            System.out.println(this);

            if (Math.random() > 0.5) {
                acoes.setPrecoA((int) (acoes.getValor() + (valor + ((15/100) * valor ) )));
            }
            if (Math.random() < 0.5) {
                acoes.setPrecoB((int) ((acoes.getValor() + (valor + ((15/100) * valor ) ))));

            }
        }
            if (acoes.getValor() > this.valor)
                this.valor = this.valor + 1;
             else this.valor = this.valor - 1;


    }

}
