public abstract class Animal {

    //classe abstrata é indicada em italico
    public float peso;
    public int numPatas;

    public void mostraInfo(){
        System.out.println("Peso: " + peso);
        System.out.println("Num de Patas: " + numPatas);
    }

    public void comer(){
        System.out.println("Como um pouco de tudo");
    }

    //metodos abstratos são representados em italico
    public abstract void seDivertir();
}
