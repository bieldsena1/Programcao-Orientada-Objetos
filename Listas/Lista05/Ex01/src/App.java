import Loja.Loja;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja("Loja ", "Biel");
        System.out.println("Essa é a " + loja.getNomeLoja() + "do " + loja.getNomeDono());
        loja.adicionarProduto("torneira", 15.99);
        loja.adicionarProduto("chuveiro", 99.99);
        loja.adicionarProduto("manga", 3.50);
        loja.adicionarProduto("vo nadaaa", 1.99);
        loja.adicionarProduto("o tata eh foda", 9999.99);
        loja.tabelaDeProdutos();
        loja.getprodutos().get(1).exibirDados();
    
    }
}
