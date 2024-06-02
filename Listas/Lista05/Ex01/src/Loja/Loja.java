package Loja;

import java.util.ArrayList;

public class Loja {
    private  String nomeLoja;
    private String nomeDono;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int quantidadeFranquia;
    
    public Loja(String nomeLoja, String nomeDono){
        this.nomeLoja = nomeLoja;
        this.nomeDono = nomeDono;
    }
    public String getNomeLoja(){
        return nomeLoja;
    }
    public String getNomeDono(){
        return nomeDono;
    }
    public ArrayList<Produto> getprodutos(){
        return this.produtos;
    }

    public void adicionarProduto(String produto, double preco){
        produtos.add(new Produto(produto, preco));
    }

    public void tabelaDeProdutos(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(String.format(
                """
                [%s] %s
                Preco: R$ %s 
                """,
                (i+1) , produtos.get(i).getNomeProduto(), produtos.get(i).getValor()
            ));
        }
    }
}