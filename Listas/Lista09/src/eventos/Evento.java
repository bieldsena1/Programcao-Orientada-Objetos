package eventos;

import java.time.LocalDate;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String data , String local){
        this.nome = nome;
        this.data = data;
        this.local = local;
    }
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s,
            Local: %s,
            Data: %s
            """,
            nome,
            local,
            data
        ));
    }
    public abstract void comecarEvento();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.nome = local;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.nome = data;
    }

    
}
