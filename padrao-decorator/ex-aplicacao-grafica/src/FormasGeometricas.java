
    //Component
    public abstract class FormasGeometricas{

        private String descricao;



        public String getDescricao() {
            return this.descricao;
        }
        public void setDescricao(String descricao){
            this.descricao = descricao;
        }

        public void desenhar() {
            System.out.println("("  + getDescricao() + ")" );
        }
        }


