import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Jogadorlol jogadorlol = new Jogadorlol();
        jogadorlol.nick = "Biel";
        jogadorlol.nivel = 30;
        jogadorlol.rank = "diamante";

        Partida partida = new Partida();
        partida.nomeMapa = "Summuner's rift";
        partida.localMapa = "top";

        Campeao campeao = new Campeao();
        campeao.nome = "Jax";
        campeao.dificuldadeBoneco = 1200;
        campeao.velocidade = 1000;
        campeao.estilo = "Lutador"; 
        
        jogadorlol.AtributosImprimir();
        System.out.println();

        partida.imprimirAtributosPartida();
        System.out.println();

        campeao.AtributosImprimir();
        System.out.println();

    }
}
