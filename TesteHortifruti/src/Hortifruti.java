 import javax.swing.*;
 import java.text.SimpleDateFormat;
 import java.util.Date;

 public class Hortifruti {

        private String nomeProduto;

        private String tipoProduto;

        private Double valorProduto;

        private Integer quantidadeDisponivel;

        private Double lucro;

        private Integer quantidadeAPegar;

        private Integer validadeDoProduto;

        private Integer dataAtual;

        private Integer dataValidade;

        private Integer valorDesconto;

        public Integer a;

     public String getNomeProduto() {
            return nomeProduto;
        }

        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public String getTipoProduto() {
            return tipoProduto;
        }

        public void setTipoProduto(String tipoProduto) {
            this.tipoProduto = tipoProduto;
        }

        public Double getValorProduto() {
            return valorProduto;
        }

        public void setValorProduto(Double valorProduto) {
            this.valorProduto = valorProduto;
        }

        public Integer getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }

        public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        public Double getLucro() {
            return lucro;
        }

        public void setLucro(Double lucro) {
            this.lucro = lucro;
        }

        public Integer getQuantidadeAPegar() {
            return quantidadeAPegar;
        }

        public void setQuantidadeAPegar(Integer quantidadeAPegar) {
            this.quantidadeAPegar = quantidadeAPegar;
        }

        public Integer getValidadeDoProduto() {
            return validadeDoProduto;
        }

        public void setValidadeDoProduto(Integer validadeDoProduto) {
            this.validadeDoProduto = validadeDoProduto;
        }

        /*
        Função para cadastrar o produto
        */


        public void cadastrarProduto(){

            nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto: ");
            tipoProduto = JOptionPane.showInputDialog("Informe o tipo do produto (Fruta, Legume ou Vegetal): ");
            valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço da unidade do produto: "));
            quantidadeDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade disponivel do produto"));
            validadeDoProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe a validade do restante produto EM DIAS a partir " +
                    "do momento em que ele será registrado: "));
        }


        /*
        Função para mostrar o produto na tela
        */


        public void mostrarProduto(){

            JOptionPane.showMessageDialog(null,"Nome do produto: " +this.nomeProduto+ "\nTipo do produto: " +this.tipoProduto+
                    "\nValor do produto (Unitário): R$" +this.valorProduto+ "\nQuantidade disponivel: " +this.quantidadeDisponivel+
                    "\nValidade do produto (EM DIAS): " +this.validadeDoProduto);
        }


        /*
        Função para verificação de estoque
        * */
     

        public Boolean verificaEstoque(Integer quantidadeDisponivel, Integer quantidadeAPegar){
            if(quantidadeAPegar <= quantidadeDisponivel){
                return true;
            }
            return false;
        }


        /*
        Função de venda do produto
        juntamente com o lucro após a venda
        */


        public Boolean vendaProduto(){
            quantidadeAPegar = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade que deseja comprar: "));
            if(verificaEstoque(this.quantidadeDisponivel, quantidadeAPegar)){
                lucro = this.valorProduto *= quantidadeAPegar;
                this.quantidadeDisponivel -= this.quantidadeAPegar;
                return true;
            }
            return false;
        }


        /*
        Função para verificar se o estoque está zerado ou não
         caso esteja
          ele passará a ser true
          */


        public Boolean estoqueZerado(){
            if(this.quantidadeDisponivel == 0){
                return true;
            }
            return false;
        }

        /*public void verificaValidade(){
         dataAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias se passaram desde que o produto foi cadastrado: "));
            if(this.dataAtual >= this.validadeDoProduto){
                a=1;
            } else if (this.dataAtual < this.validadeDoProduto - 1) {
                a=2;
                this.lucro = ((this.valorProduto*this.quantidadeAPegar) / (100/10));
            }else{
                this.lucro = this.valorProduto * this.quantidadeAPegar;
            }
        }*/
 }


