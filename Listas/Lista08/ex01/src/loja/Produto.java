package loja;

import exceptions.NomeInvalidoException;
import exceptions.ValorInvalidoException;

public class Produto {
    private String nome;
    private double preco;

    public Produto (String nome, double preco) throws Exception{
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if(nome.length() > 3) {
            this.nome = nome;
        } else {
            throw new NomeInvalidoException();
        }
    }

    public double getValor() {
        return preco;
    }

    public void setPreco(double preco) throws ValorInvalidoException{
        if(preco <= 0) {
            throw new ValorInvalidoException();
        } else {
            this.preco = preco;
        }
    }
}