public class Campeao {
    String nome;
    int dificuldadeBoneco;
    String estilo;
    int velocidade;
    
    public void bonecoJogar(){
        System.out.println("vai jogar com 0" + nome);
    }
    public void nivelForca(){
        System.out.println("A dificuldade dele é de: ");
    }
    public void nivelVelocidade(){
        System.out.println("o nivel de velocidade desse boneco é: ");
    }
    public void AtributosImprimir(){
        System.out.println("nome campeao: " + nome);
        System.out.println("dificuldade: " + dificuldadeBoneco);
        System.out.println("estilo: " + estilo);
        System.out.println("velocidade: " + velocidade);
    }
}
