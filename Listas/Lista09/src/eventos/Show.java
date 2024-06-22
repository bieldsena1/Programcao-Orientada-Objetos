package eventos;

public final class Show extends Evento{
    String artista;
    public Show(String nome, String data, String local, String artista){
        super(nome, data, local);
        this.artista = artista;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            Data: %s
            Local: %s
            Artistas: %s
            """,
            getNome(),
            getData(),
            getLocal(),
            getArtista()
        ));
    }

    public void comecarEvento(boolean comAplausos){
        if(comAplausos){
            System.out.println("aeeee");
        }else{
            System.out.println("aahhh ;-;");
        }
    }

   
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
}




