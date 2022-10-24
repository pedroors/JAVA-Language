public class TesteONG {
    public static void main(String[] args) {

            ong ong1 = new ong();
            ong1.setNomeTemporario("Jonsen");
            ong1.setIdade(6);
            ong1.setCor("Cinza");
            ong1.setSexo("M");
            ong1.setCastrado(true);
            ong1.setVacinado(true);
            ong1.setVermifugado(false);
            ong1.setSaudavel(true);

        System.out.println(ong1.getNomeTemporario());

    }
}
