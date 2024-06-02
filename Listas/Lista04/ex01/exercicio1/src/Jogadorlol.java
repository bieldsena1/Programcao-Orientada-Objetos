public class Jogadorlol {
    String nick;
    int nivel;
    String rank;

    public void AtributosImprimir(){
        System.out.println("nick: " + nick );
        System.out.println("Nivel: " + nivel);
        System.out.println("Rank: " + rank);
    }
    public void podeJogarRanqueada(){
        if(nivel > 30){
            System.out.println(nick + " pode jogar ranqueada");
        }else{
            System.out.println(nick + " não pode jogar ranqueada");
        }
    }
    public void eloPartida(){
        if (rank == "diamante"){
            System.out.println("O " + nick + " poderá jogar partida apenas com diamantes");
        }else if (rank == "esmeralda"){
            System.out.println("O " + nick + " poderá jogar partida apenas com esmeraldas");
        }else if (rank == "platina"){
            System.out.println("O " + nick + " poderá jogar partida apenas com platinas");
        }
    }
    
}
