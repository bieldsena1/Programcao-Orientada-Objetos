package escola;

public final class Professor extends Usuario{
    private String disciplina;

    public Professor(String nome, String email, String disciplina){
        super(nome, email);
        this.disciplina = disciplina;
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
            System.out.println("Disciplna: " +  disciplina);
       }
    }
    public String getMatricula(){
        return disciplina;
    }
    public void setMatricula(String disciplina){
        this.disciplina = disciplina;
    }
}




