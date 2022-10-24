public class TesteCarro {
    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.setCor("Verde");

        uno.setModelo("Mille");

        uno.setVelocidadeAtual(0);

        uno.setVelocidadeMaxima(300);

        uno.setLigado(false);
        System.out.println(uno.getLigado());

        uno.ligar();

        uno.acelerar(120);
    }
}
