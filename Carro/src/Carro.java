    public class Carro{

        private String cor;
        private String modelo;
        private Integer velocidadeAtual;
        private Integer velocidadeMaxima;
        private Boolean ligado;

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Integer getVelocidadeAtual() {
            return velocidadeAtual;
        }

        public void setVelocidadeAtual(Integer velocidadeAtual) {
            this.velocidadeAtual = velocidadeAtual;
        }

        public Integer getVelocidadeMaxima() {
            return velocidadeMaxima;
        }

        public void setVelocidadeMaxima(Integer velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public Boolean getLigado() {
            return ligado;
        }

        public void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        public void ligar(){
            this.ligado = true;
        }

        public void acelerar(Integer velocidadeASerSomadaComAVelocidadeAtual){
            this.velocidadeAtual = velocidadeAtual + velocidadeASerSomadaComAVelocidadeAtual;
        }

        public Integer pegarMarcha(){

            boolean velocidadeMaiorOuIgualAZero = this.velocidadeAtual >= 0;
            boolean velocidadeMenorOuIgualAVinte = this.velocidadeAtual <= 20;
            boolean velocidadeMaiorQueVinte = this.velocidadeAtual > 20;
            boolean velocidadeMenorOuIgualAQuarenta = this.velocidadeAtual <= 40;
            boolean velocidadeMaiorQueQuarenta = this.velocidadeAtual > 40;
            boolean velocidadeMenorOuIgualASessenta = this.velocidadeAtual <= 60;
            boolean velocidadeMaiorQueSetenta = this.velocidadeAtual > 70;
            boolean velocidadeMenorOuIgualACem = this.velocidadeAtual <= 100;
            boolean velocidadeMaiorQueCem = this.velocidadeAtual > 100;

            if(velocidadeMaiorOuIgualAZero&&velocidadeMenorOuIgualAVinte){
                return 1;
            }
            else if(velocidadeMaiorQueVinte&&velocidadeMenorOuIgualAQuarenta){
                return 2;
            }
            else if(velocidadeMaiorQueQuarenta&&velocidadeMenorOuIgualASessenta){
                return 3;
            }
            else if(velocidadeMaiorQueSetenta&&velocidadeMenorOuIgualACem){
                return 4;
            }
            else{
                return 5;
            }
        }
    }

