import java.util.Scanner;

public class App {
    public static boolean[][] matriz = new boolean[4][4];
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      preencherMatriz();
      escolherLocal();
      imprimirMatriz();
    }
    public static void preencherMatriz(){
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
        matriz[i][j] = false;
      }
    }
  }
    public static void escolherLocal(){
      int linha = Integer.parseInt(SCAN.nextLine());
      int coluna = Integer.parseInt(SCAN.nextLine());
      matriz[linha][coluna] = true;
    }
    public static void imprimirMatriz(){
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){     
          if(matriz[i][j] == false){
            System.out.print("|X");
        }
          else{
            System.out.print("|O");
        }      
      }
        System.out.print("|");
        System.out.println();
    }
  }
}
