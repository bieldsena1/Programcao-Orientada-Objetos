package Loja;
public class Produto {
    private String produto;
    private double preco;

    public Produto(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public void setNomeProduto(String produto){
        this.produto = produto;
    }
    public String getNomeProduto(){
        return produto;
    }

    public void setValor(double valor){
        this.preco = preco;
    }
    public double getValor(){
        return preco;
    }

    public void exibirDados(){
        System.out.println("Produto: " + produto);
        System.out.println("Preco: " + preco);
    }
}