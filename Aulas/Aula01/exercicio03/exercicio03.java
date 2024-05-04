import java.util.*;

public class Main {
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final int VAGOES = 12;
  private static final int PESO_MAXIMO = 50;
  
    public static void main(String[] args) {
      int[] trem = new int[VAGOES];
      carregarVagoes(trem);
      verificarVagoes(trem);
  }
    public static void carregarVagoes(int[] trem){
    for(int i = 0; i < trem.length; i++){
      trem[i] = Integer.parseInt(SCANNER.nextLine());
    }
  }
    public static void verificarVagoes(int[] trem){
    for(int i = 0; i < trem.length; i++){
      if(trem[i] > PESO_MAXIMO){
        System.out.println((i + 1) + "° vagao ultrapassou o limite de peso");
      }
    }
  }
}