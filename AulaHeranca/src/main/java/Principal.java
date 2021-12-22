import outroPacote.Profissional;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        /*Profissional p1 = new Profissional();
        p1.nome = "Lucas";
        p1.idade = 35;
        p1.valorHora = 20;
        p1.qtdHoras = 120;
        System.out.println("Salário do(a) " + p1.nome + ": R$" + p1.calculaSalario());

        Vendedor.Professor prof1 = new Vendedor.Professor();
        prof1.nome = "Mariana";
        prof1.idade = 27;
        prof1.valorHora = 30;
        prof1.qtdHoras = 100;
        prof1.materia = "Inglês";
        prof1.corrigirProva();
        System.out.println("Salário do(a) " + prof1.nome + ": R$" + prof1.calculaSalario());

        Dentista d1 = new Dentista();
        d1.nome = "Joelma";
        d1.idade = 45;
        d1.valorHora = 50;
        d1.qtdHoras = 40;
        d1.valorConsulta = 250;
        d1.numConsultas = 30;
        System.out.println("Salário do(a) " + d1.nome + ": R$" + d1.calculaSalario());

        Vendedor v1 = new Vendedor();
        v1.nome = "João";
        v1.idade = 45;
        v1.valorVendido = 50000;
        v1.custo = 30000;
        v1.loja = "Lojinha do Jão";
        System.out.println("Salário do(a) " + v1.nome + ": R$" + v1.calculaSalario());

        Profissional[] sofredores = new Profissional[10];
        sofredores[0] = prof1;
        sofredores[1] = p1;
        sofredores[2] = d1;
        sofredores[3] = v1;

        System.out.println("");
        for (int i=0; i<sofredores.length; i++){
            if(sofredores[i] != null){
                System.out.println("----------------------------------");
                sofredores[i].mostraInfo();
                if(sofredores[i] instanceof Vendedor.Professor){
                    Vendedor.Professor pAux = (Vendedor.Professor) sofredores[i];
                    pAux.corrigirProva();
                }
                if(sofredores[i] instanceof Vendedor){
                    Vendedor vAux = (Vendedor) sofredores[i];
                    vAux.vender();
                }
            }
        }

*/

        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Uno";
        c1.cor = "Branco";
        c1.idade = 7;
        c1.setPreco(1.5f);

        c1.mostraInfo();

        System.out.println("");
        Carro c2 = new Carro("Wolks", "Fox", 3, "Prata", 2.75f);
        c2.mostraInfo();

        System.out.println();
        Tamandua t1 = new Tamandua();
        t1.setNumPatas(4);
        t1.setRabo(true);
        t1.setPeso(41);
        t1.setVida(16);
        t1.tamanhoLingua = 0.6f;
        t1.comer();
        t1.mostraInfo();

        System.out.println("");
        Camaleao cam1 = new Camaleao();
        cam1.setNumPatas(4);
        cam1.setRabo(true);
        cam1.setPeso(3);
        cam1.setVida(8);
        cam1.corAtual = "Ciano";
        cam1.comer();
        cam1.mostraInfo();
        cam1.mudarDeCor();

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(t1);
        zoo.add(cam1);

        for(int i=0; i<zoo.size(); i++){
            System.out.println("--------------------");
            zoo.get(i).mostraInfo();
            if(zoo.get(i) instanceof Camaleao){
                Camaleao cAux = (Camaleao) zoo.get(i);
                cAux.mudarDeCor();
            }
        }



    }


}
