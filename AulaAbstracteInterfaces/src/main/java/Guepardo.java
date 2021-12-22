public class Guepardo extends Animal{
    public float velMax;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Vel máxima: " + velMax);
    }

    @Override
    public void comer(){
        System.out.println("Como sou um guepardo, só como carne");
    }

    @Override
    public void seDivertir() {
        System.out.println("Correndo atrás de animais na savana");
    }

    public void hunt(){
        System.out.println("Estou caçando");
    }
}
