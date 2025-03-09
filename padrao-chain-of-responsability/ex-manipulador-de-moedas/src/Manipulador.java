//Handler

public abstract class Manipulador {

        private Manipulador sucessor;

        public void setSucessor(Manipulador sucessor){this.sucessor = sucessor;}

        public Manipulador getSucessor() {
            return this.sucessor;
        }

        public abstract void escolherManipulador(double diametro);
    }
