public class Camaleao extends Animal implements Pet{
    public String corAtual;

    @Override
    public void comer(){
        System.out.println("Comeu mosquitinhos");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: " + corAtual);
    }

    @Override
    public void mudarDeCor(){
        System.out.println("Encostou na parede e ficou branco");
    }
}
