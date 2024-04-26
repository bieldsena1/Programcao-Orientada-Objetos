import java.util.*;
public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_VETOR = 10;
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[TAMANHO_VETOR];
        preencherVetores(vetor);
        System.out.println(verificarVetores(vetor));
        
    }
    public static void preencherVetores(int[] vetor){
        for(int i = 0; i < vetor.length; i++ ){
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    public static String verificarVetores(int[] vetor){
        int numeroEscolhido = Integer.parseInt(SCAN.nextLine());
        for(int i = 0; i < vetor.length; i++ ){
            if(vetor[i] == numeroEscolhido ){
                return "ACHEI";
            }  
        }
        return "NAO ACHEI";
    }
}
