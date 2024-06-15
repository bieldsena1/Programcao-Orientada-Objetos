import exceptions.ValorInvalidoException;
import exceptions.NomeInvalidoException;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Mochila", 1000);
        
        try {
            Produto produto2 = new Produto("Mochila 2", 10000);
        } catch(NomeInvalidoException exception ) {
            System.out.println(exception.getMessage());
        }

        try {
            Produto produto2 = new Produto("Feijao", 50);
        } catch(ValorInvalidoException exception ) {
            System.out.println(exception.getMessage());
        }
    }
}