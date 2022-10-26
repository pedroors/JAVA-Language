 import javax.swing.*;
 public class Main {
     public static void main(String[] args){

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
                    System.out.println("Nao foi possivel completar a sua compra pois excede a quantidade disponivel em estoque!");
                }

              /*  hortifruti.verificaValidade();
                if(hortifruti.a == 1){
                    System.out.println("\nNao foi possivel realizar a venda! O produto excedeu o vencimento");
                } else if (hortifruti.a == 2) {
                    System.out.println("\nFalta 1 dia para o vencimento do produto, portanto você recebeu 10% de desconto no valor final da compra.");
                }else{
                System.out.println("O produto esta dentro da validade!");
         }*/


         if(hortifruti.estoqueZerado()){
                    System.out.println("\nO estoque está zerado!");
                }else{
                    System.out.println("\nQuantidade ainda disponivel em estoque: "+(hortifruti.getQuantidadeDisponivel()));
                }
            }
        }
