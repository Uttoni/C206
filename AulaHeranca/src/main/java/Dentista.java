import outroPacote.Profissional;

public class Dentista extends Profissional {
    float valorConsulta;
    int numConsultas;

    @Override
    public float calculaSalario(){

        salario = super.calculaSalario() + (valorConsulta * numConsultas);
        return salario;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(cpf);
        System.out.println("Valor Consulta: " + valorConsulta);
        System.out.println("Num Consultas: " + numConsultas);
    }
}