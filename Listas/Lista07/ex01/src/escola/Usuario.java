package escola;
public abstract class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s,
            email: %s,
            """,
            nome,
            email
        ));

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.nome = email;
    }
    
}
