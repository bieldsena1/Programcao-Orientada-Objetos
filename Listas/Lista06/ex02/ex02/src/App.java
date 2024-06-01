public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato("preto", 50);
        gato.comer();
        gato.emitirSom();

        Pato cao = new Pato("azul", 22);
        cao.comer();
        cao.emitirSom();
    }
}