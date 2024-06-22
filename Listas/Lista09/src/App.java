import eventos.Show;
import eventos.StandUp;
public class App {
    public static void main(String[] args) throws Exception {
       
        Show show = new Show("Show dos zicas", "dia onze", "Rua das palmeiras", "Henrique");
        StandUp standup = new StandUp("Standup dos zica", "Rua das palmeiras", "dia onze", "Pedro");

       
        show.exibirInformacoes();
        show.comecarEvento(true);

        System.out.println("\n");
        standup.exibirInformacoes();
        standup.comecarEvento("haha");
        
    }
}
