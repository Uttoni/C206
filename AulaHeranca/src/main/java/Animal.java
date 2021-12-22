public abstract class Animal{

    protected int numPatas;
    protected boolean rabo;
    protected float peso;
    protected int vida;

    public void comer(){
        System.out.println("Consigo comer!");
    }

    public void setNumPatas(int numPatas){
        this.numPatas = numPatas;
    }

    public int getNumPatas(){
        return numPatas;
    }

    public void setRabo(boolean rabo){
        this.rabo = rabo;
    }

    public boolean getRabo(){
        return rabo;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public void mostraInfo(){
        System.out.println("Patas: " + numPatas);
        System.out.println("Rabo: " + rabo);
        System.out.println("Peso: " + peso);
        System.out.println("Vida: " + vida);
    }
}
