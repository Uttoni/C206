public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numConta = 1234;
        c1.nome = "Uttoni";
        c1.setSaldo(2000);


        System.out.println("Saldo: " + c1.getSaldo());
        c1.sacar(250);
        System.out.println("Saldo pós saque: " + c1.getSaldo());


        Violao v1 = new Violao();
        v1.preco = 500;
        System.out.println();
        System.out.println("Codigo: " + v1.codigo);
        System.out.println("Num cordas: " + v1.NUM_CORDAS);
        System.out.println("Preço: " + v1.preco);

        Violao v2 = new Violao();
        v2.preco = 1000;

        System.out.println("Codigo: " + v2.codigo);
        System.out.println("Num cordas: " + v2.NUM_CORDAS);
        System.out.println("Preço: " + v2.preco);

        System.out.println("Codigo violao 1: " + v1.codigo);
        System.out.println("Codigo violao 2: " + v2.codigo);
        System.out.println("Contador violao 1: " + v1.contador);

        /*
        * + public
        * - private
        * # protected
        * sublinhado static
        * capslock final
        * */
    }
}
