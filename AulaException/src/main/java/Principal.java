import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        Fruta frutas[] = new Fruta[5];

        frutas[0] = new Fruta();
        frutas[0].nome = "Maçã";
        frutas[0].cor = "Verde";

        frutas[1] = new Fruta();
        frutas[1].nome = "Laranja";
        frutas[1].cor = "Laranja";

        try{
            for (int i=0; i<frutas.length; i++){
                System.out.println("Nome: " + frutas[i].nome);
            }
        }catch(NullPointerException e){
            System.out.println(e);
        }

        try {
            System.out.println("3/0: " + 3 / 0);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
        }finally {
            System.out.println("Tentei dividir");
        }

        System.out.println("Continua funcionando");

        try {
            frutas[7].nome = "Uva";
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("-----------------------------------------");
        Pessoa p1 = new Pessoa();
        p1.nome = "Enzo";
        p1.idade = 4;
        p1.irNaBarca(1.1f);
        try {
            p1.irNoChapeuMexicano(1.1f);
        }catch(AlturaException e){
            JOptionPane.showMessageDialog(null, e);
        }


        JOptionPane.showMessageDialog(null, "Minha primeira jOption");

    }
}
