package eventos;

public final class StandUp extends Evento{
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante){
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            Local: %s
            Data: %s
            Comediante: %s
            """,
            getNome(),
            getLocal(),
            getData(),
            getComediante()
        ));
    }
    public void comecarEvento(String piada){
        System.out.println("Sabe o oque o ovo neto falou pro ovo vo? ovo");
    }
    public String getComediante(){
        return comediante;
    }
    public void setComediante(String comediante){
        this.comediante = comediante;
    }
}




