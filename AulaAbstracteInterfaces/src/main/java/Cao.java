public class Cao extends Animal implements Pet, Territorio{
    public boolean vacinado;
    public String nomeDono;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Vacinado(a): " + vacinado);
        System.out.println("Dono(a): " + nomeDono);
    }

    @Override
    public void seDivertir() {
        System.out.println("Brincando de pegar a bolinha");
    }

    @Override
    public void fazerTruques(){
        System.out.println("Dar a patinha");
        System.out.println("Fingir de morto");
    }

    @Override
    public void marcarTerritorio() {
        System.out.println("O cachorro fez xixi no portão do vizinho");
    }
}
