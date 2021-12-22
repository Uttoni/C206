public class Conta {

    public int numConta;
    public String nome;
    long cpf;
    private double saldo;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean podeSacar(double valor){
        if(valor>saldo){
            return false;
        }else{
            return true;
        }
    }

    public void sacar(double valor){
        if(podeSacar(valor)){
            saldo -= valor;
            System.out.println("Você sacou R$" + valor + " reais");
        }else{
            System.out.println("Valor desejado maior que o saldo");
        }
    }
}
