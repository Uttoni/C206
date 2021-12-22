package outroPacote;

public class Profissional {
    public String nome;
    public int idade;
    public float valorHora;
    public float qtdHoras;
    public float salario;
    protected String cpf;

    public float calculaSalario(){
        salario = valorHora * qtdHoras;
        return salario;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Qtd Horas: " + qtdHoras);
        System.out.println("Salario: " + salario);
    }
}
