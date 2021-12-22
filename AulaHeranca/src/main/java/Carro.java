public class Carro {
    public String marca;
    public String modelo;
    public int idade;
    public String cor;
    private float preco;

    Carro(){

    }

    Carro(String marca, String modelo, int idade, String cor, float price){
        this.marca = marca;
        this.modelo = modelo;
        this.idade = idade;
        this.cor = cor;
        this.preco = price;
    }


    public void mostraInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Idade: " + idade);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preco);
    }


    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }
}
