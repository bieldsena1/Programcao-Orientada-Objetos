import java.util.Scanner;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
      int idade = Integer.parseInt(SCAN.nextLine());
      System.out.println(conferirIdade(idade));
  }
  private static String conferirIdade(int idade){
    if(idade < 12){
      return "Infantil";
    }
    else if(idade >= 12 && idade < 14 ){
      return "Juvenil A";
    }else if(idade >= 15 && idade < 17 ){
      return "Juvenil B";
    }else{
      return "Adulto";
    }
  }
}