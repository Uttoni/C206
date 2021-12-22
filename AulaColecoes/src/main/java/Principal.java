import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //COLEÇÕES

        //ARRAYLIST
        /* não precisa definir o tamanho
        * não precisa preocupar com o tipo do dado
        * facilitadores: adicionar, ordenar, filtrar
        */

        List lista = new ArrayList();
        //ArrayList lista2 = new ArrayList();

        Planta p1 = new Planta();
        p1.nome = "Hortelã";
        p1.preco = 2.5f;
        p1.uso = "Chá ou suco";

        lista.add(5);
        lista.add(true);
        lista.add("Maçã");
        lista.add(p1);

        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Maracujá");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Amora");

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Fruta na posição 2: " + frutas.get(2));
        System.out.println("Guarda na mesma ordem que insere");
        for (int i=0; i<frutas.size(); i++){
            System.out.println(frutas.get(i));
        }


        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Arraylist ordenado: ");
        Collections.sort(frutas);
        for (int i=0; i<frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Arraylist ordenado inverso: ");
        Collections.reverse(frutas);
        for (int i=0; i<frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        //CLASSES WRAPPERS
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(5);
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Numeros em ordem decrescente: ");
        Collections.sort(numeros);
        Collections.reverse(numeros);
        for (int i=0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Maior valor: " + Collections.max(numeros));
        System.out.println("Menor valor: " + Collections.min(numeros));

        Planta p2 = new Planta();
        p2.nome = "Alho poró";
        p2.preco = 4.5f;
        p2.uso = "Comida";

        Planta p3 = new Planta();
        p3.nome = "Tomilho";
        p3.preco = 3;
        p3.uso = "Tempero";

        ArrayList<Planta> plantas = new ArrayList<>();
        plantas.add(p1);
        plantas.add(p2);
        plantas.add(p3);

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Arraylist de plantas: ");
        for (int i=0; i<plantas.size(); i++){
            System.out.println(plantas.get(i));
        }

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Arraylist de plantas ordenado: ");
        Collections.sort(plantas);
        for (int i=0; i<plantas.size(); i++){
            System.out.println(plantas.get(i));
        }

        System.out.println("Maior valor: " + Collections.max(plantas));




        //HashSet
        //ORDENA AUTOMATICAMENTE
        //nao aceita valores repetidos
        System.out.println("");
        System.out.println("-------------------------------");
        Set<Integer> primos = new HashSet<>();
        primos.add(11);
        primos.add(3);
        primos.add(31);
        primos.add(5);
        primos.add(3);
        System.out.println(primos);

        Map<String, String> estados = new HashMap<>();
        estados.put("MG", "Minas Gerais");
        estados.put("SP", "São Paulo");
        estados.put("AL", "Alagoas");

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Estado com a sigla MG: " + estados.get("MG"));
        System.out.println("Chaves: " + estados.keySet());
        System.out.println("Conjunto de pares inseridos: " + estados.entrySet());


        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Removendo o hortelã: ");
        plantas.remove(0);

        for (int i=0; i<plantas.size(); i++){
            System.out.println(plantas.get(i));
        }

        plantas.clear();
        for (int i=0; i<plantas.size(); i++){
            System.out.println(plantas.get(i));
        }

        if(plantas.isEmpty()){
            System.out.println("Arraylist vazio");
        }else{
            System.out.println("Arraylist não está vazio");
        }


    }
}
