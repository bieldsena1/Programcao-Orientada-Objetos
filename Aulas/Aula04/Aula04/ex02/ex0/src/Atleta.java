public class Atleta {
    String nome;
    int idade;
    int atletas;
    boolean genero;
    int forca;
    int velocidade;
    boolean ehCorredor;

    public void competicaoCorrida(){
        if(ehCorredor){
            System.out.println("Entrou para corrida")
        }
        else{
            System.out.println("nao pode participar")
        }
    }
    public void categoria(){
        if(ehCorredor & idade > 18){
            System.out.println("Categoria Adulto")
        }
        else if(ehCorredor & idade < 18){
            System.out.println("Categoria Crianca")
        }
    }
    public void correr(){
        
    }

}
