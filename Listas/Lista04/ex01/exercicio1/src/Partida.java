public class Partida {
    String nomeMapa;
    String localMapa;
    String bot;
    

    public void suaFuncao(){
        if(localMapa == "top"){
            System.out.println("vai jogar top");
        }else if(localMapa == "jungle"){
            System.out.println("vai jogar jungle");
        }else if(localMapa == "mid"){
            System.out.println("vai jogar mid");
        }else if(localMapa == "bot"){
            if(bot == "adc"){
                System.out.println("vai jogar adc");
            }
            else if(bot == "sup"){
                System.out.println("vai jogar sup");
            }
        }
    }
    public void nomeDoMapa(){
        if(nomeMapa == "Summuner's Rift"){
            System.out.println("Mapa feito para jogar ranqueada, modo tradicional");
        }
    }
    public void imprimirAtributosPartida(){
        System.out.println(nomeMapa);
        System.out.println(localMapa);
        System.out.println(bot);

    }
}

