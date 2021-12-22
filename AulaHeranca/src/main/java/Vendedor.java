import outroPacote.Profissional;

public class Vendedor extends Profissional {
    String loja;
    float valorVendido;
    float custo;

    @Override
    public float calculaSalario(){
        return valorVendido - custo;
    }

    public void vender(){
        System.out.println("O(a) vendedor(a) : " + nome + " está vendendo algo");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Loja: " + loja);
        System.out.println("Valor vendido: " + valorVendido);
        System.out.println("Custo: " + custo);
    }

    public static class Professor extends Profissional {
        String materia;

        public void corrigirProva(){
            System.out.println("O(a) prof(a) " + nome +  " da materia de " + materia + " está corrigindo provas :)");
        }

        @Override
        public void mostraInfo(){
            super.mostraInfo();
            System.out.println("Materia: " + materia);
        }
    }
}
