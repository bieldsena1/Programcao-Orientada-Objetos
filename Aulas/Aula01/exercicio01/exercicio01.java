import java.util.Scanner; 

public class Main {
  private static final Scanner READ = new Scanner(System.in);
  public static void main(String[] args) {
    int numero = Integer.parseInt(READ.nextLine());
    contaRegressiva(numero);
  }
  private static void contaRegressiva(int numero){
    while(numero >= 0){
      System.out.println(numero--);
    }
  }
  
}