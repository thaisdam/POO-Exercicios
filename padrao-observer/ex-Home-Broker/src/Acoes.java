import java.util.ArrayList;


public class Acoes implements Sujeito {

    private int valor = 0;
    private String ativo;


    private ArrayList<Observador> lista = new ArrayList<Observador>();

    public Acoes(int valor) {
        this.valor = valor;
    }


    public void addObserver(Observador o) {
        lista.add(o);
    }

    public void removeObserver(Observador o) {
        lista.remove(o);
    }

    public void notifyObservers() {
        for (Observador o : lista)
            o.update(this);
    }

    public int getValor() {
        return this.valor;
    }


    public void setPrecoA(int valor) {
          this.valor = valor;
        System.out.println("O Valor da ação: " + " Subiu " + this.valor + "%");
    }

    public void setPrecoB(int valor) {
     this.valor = valor;
     System.out.println("O Valor da ação: " + " Desceu " + this.valor + "%");
    }

    public void show() {
        notifyObservers();
    }


    public String getAtivo() {
        return this.ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}


