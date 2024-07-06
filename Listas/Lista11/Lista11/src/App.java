import Exceptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica("Menor Magrinho", "Kyan", "Dias antes de Mandrake");
        Musica musica2 = new Musica("um quebrada inteligente", "Kyan ft Mu540", "um quebrada inteligente");
        Musica musica3 = new Musica("Randandan", "Kyan", "SVANTH");

        BibliotecaMusical biblioteca = new BibliotecaMusical();
        biblioteca.adicionarMusica(musica.getTitulo(), musica);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);

        biblioteca.buscarMusica(musica2.getTitulo());
        try {
            System.out.println(biblioteca.buscarMusica(musica3.getTitulo()));
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}