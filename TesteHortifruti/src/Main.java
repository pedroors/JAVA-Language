 import javax.swing.*;
        public class Main {
            public static void main(String[] args) {

                Hortifruti hortifruti = new Hortifruti();

                hortifruti.cadastrarProduto();
                System.out.println("Produto disponivel: "+(hortifruti.getNomeProduto()));
                System.out.println("\nQuantidade disponivel para comprar: "+(hortifruti.getQuantidadeDisponivel())+" Unidades");
                System.out.println("\nPreco Unitario: R$"+(hortifruti.getValorProduto()));
                System.out.println("\n----------------------------\n");
                hortifruti.mostrarProduto();



                if(hortifruti.vendaProduto()){
                    System.out.println("A sua compra foi realizada com sucesso!");
                    System.out.println("\nO lucro sobre a venda foi de: R$"+(hortifruti.getLucro()));
                    System.out.println("\nA validade do produto comprado e de: "+(hortifruti.getValidadeDoProduto())+ " Dias");
                }else{
                    System.out.println("Nao foi possivel completar a sua compra!");
                }

                if(hortifruti.estoqueZerado()){
                    System.out.printf("\nO estoque está zerado!");
                }else{
                    System.out.println("\nQuantidade ainda disponivel em estoque: "+(hortifruti.getQuantidadeDisponivel()));
                }
            }
        }
