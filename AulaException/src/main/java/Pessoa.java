public class Pessoa {

    public String nome;
    public int idade;

    public void irNaBarca(float altura){

        try {
            if (altura < 1.2) {
                throw new AlturaException(altura);
            }

            System.out.println("Consegui ir no brinquedo");
        }catch(AlturaException e){
            e.porqueNaoPode();
        }
    }

    public void irNoChapeuMexicano(float altura) throws AlturaException{

        if (altura < 1.2) {
            throw new AlturaException(altura);
        }

        System.out.println("Consegui ir no brinquedo");
    }
}
