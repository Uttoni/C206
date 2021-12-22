public class Planta implements Comparable<Planta>{
    public String nome;
    public float preco;
    public String uso;

    @Override
    public String toString() {
        return "Planta{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", uso='" + uso + '\'' +
                '}';
    }

    @Override
    public int compareTo(Planta p) {
        return nome.compareTo(p.nome);
        //return Float.compare(preco, p.preco);
    }
}
