public class Tamandua extends Animal{

    public float tamanhoLingua;

    @Override
    public void comer(){
        super.comer();
        System.out.println("Como formiga!!!");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Lingua: " + tamanhoLingua);
    }
}
