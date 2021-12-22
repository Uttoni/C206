public class Principal {

    public static void main(String[] args) {
        Guepardo g1 = new Guepardo();
        g1.peso = 20;
        g1.numPatas = 4;
        g1.velMax = 130;

        Cao c1 = new Cao();
        c1.peso = 5.4f;
        c1.numPatas = 4;
        c1.vacinado = true;
        c1.nomeDono = "Gertrude";

        Animal[] animais = new Animal[10];
        animais[0] = g1;
        animais[1] = c1;

        for (int i=0; i<animais.length; i++){
            if(animais[i] != null) {
                System.out.println("----------------------------------");
                animais[i].mostraInfo();
                animais[i].comer();
                animais[i].seDivertir();
                if(animais[i] instanceof Guepardo){
                    Guepardo gAux = (Guepardo) animais[i];
                    gAux.hunt();
                }
                if(animais[i] instanceof Cao){
                    Cao cAux = (Cao) animais[i];
                    cAux.fazerTruques();
                    cAux.marcarTerritorio();
                }

            }
        }
    }
}
