public class AlturaException extends Exception{

    public float altura;

    public AlturaException(float altura){
        System.out.println("Não pode ir porq tem menos de 1.2 de altura");
        this.altura = altura;
    }

    public void porqueNaoPode(){
        System.out.println("Sua altura é " + altura + " e para ir no brinquedo é preciso que tenha no mínimo 1.2m");
    }

}
