package escola;

public final class Aluno extends Usuario{
    private String matricula;

    public Aluno(String nome, String email, String matricula){
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            email: %s
            """,
            getNome(),
            getEmail()
        ));
    }
    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula){
       if(exibirNome){
            System.out.println("Nome: " + getNome());
       }
       if(exibirEmail){
            System.out.println("Email: " + getEmail());
       }
       if(exibirMatricula){
            System.out.println("Matriculado: " + matricula);
       }
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}




