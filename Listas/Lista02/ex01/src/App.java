import java.util.*;
public class App {
    private static int PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[PERGUNTAS];
    private static String[] GABARITO = new String[PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome = retornaNome();
        comecarPerguntas(nome);
        fazerPrimeiraPergunta();
        fazerSegundaPergunta();
        fazerTerceiraPergunta();
        imprimirPontuacao(nome);
        encerrarQuiz(nome);
    }
    public static String retornaNome(){
        System.out.print("Digite seu nome: ");
        String nome = "";
        while (nome.isBlank()){
            nome = SCAN.nextLine();
        }
        return arrumarNome(nome);

    }
    public static String arrumarNome(String nome){
        if(nome.isBlank()){
            return "NPC";
        }
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String inicial = String.valueOf(primeiroNome.charAt(0));
        String nomeSemInicial = primeiroNome.substring(1);
        String nomeArrumado = inicial.toUpperCase() + nomeSemInicial.toLowerCase();
        return nomeArrumado;

    }
    public static void comecarPerguntas(String nome){
        System.out.println(String.format(
            """
            Olá, %s!
            Vamos começar nosso quiz e ele será sobre LOL

            Aperte ENTER para iniciarmos.
            """,
            nome
        ));
        SCAN.nextLine();
    }

    public static void fazerPrimeiraPergunta(){
        String respostaUsuario = "";
        do{
            System.out.println(
                """
                1 - Qual desses campeões bate com um poste ? 

                A - Jax
                B - Darius
                C - Camille
                D - Akali

                """
            );

            respostaUsuario = SCAN.nextLine();
        }while(!respostaValida(respostaUsuario));

        RESPOSTAS[0] = respostaUsuario;
        GABARITO[0] = "A";
        
    }
    public static void fazerSegundaPergunta(){
        String respostaUsuario = "";
        do{
            System.out.println(
                """
                2 - A fala "Quem vai encarar o campeão?" É de qual campeão?
                
                A - Darius
                B - Camille
                C - Jax
                D - Akali
                
                """
            );

            respostaUsuario = SCAN.nextLine();
        }while(!respostaValida(respostaUsuario));

        RESPOSTAS[1] = respostaUsuario;
        GABARITO[1] = "C";

    }
    public static void fazerTerceiraPergunta(){
        String respostaUsuario = "";
        do{
            System.out.println(
                """
                3 - Qual desses campeões tem reset ?

                A - Jax
                B - Akali
                C - Darius
                D - Camille
                
                """
            );

            respostaUsuario = SCAN.nextLine();
        }while(!respostaValida(respostaUsuario));

        GABARITO[2] = "C";
        RESPOSTAS[2] = respostaUsuario;

    }
    public static boolean respostaValida(String respostaUsuario){
        if(respostaUsuario.isBlank()){
            System.out.println("Tente novamente");
            return false;
        }
        return true;
    }
    public static int quantosAcertos(){
        int acertos = 0;
        for(int i = 0; i < PERGUNTAS; i++){
            if(RESPOSTAS[i] == GABARITO[i]){
                acertos++;
            }
        }
        return acertos;
    }
    public static void imprimirPontuacao(String nome){
        System.out.println(String.format(
                """
                 %s, Vamos ver como se saiu
                """,
                nome
            ));

        if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2])){
            System.out.println(String.format(
                    """
                    Boa boa %s, você acertou todas malandro,
                    ce é zica mlk.
                    """, 
                    nome));
        }else if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || RESPOSTAS[2].equalsIgnoreCase(GABARITO[2]) && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2])) {
            System.out.println(String.format(
                    """
                    caraca %s, você acertou duas!
                    tá zoado irmão, vamos melhorar um pouquin
                    """, 
                    nome
                    ));
        }else if (RESPOSTAS[0].equalsIgnoreCase(GABARITO[0]) == false && RESPOSTAS[1].equalsIgnoreCase(GABARITO[1]) == false && RESPOSTAS[2].equalsIgnoreCase(GABARITO[2]) == false) {
            System.out.println(String.format(
                    """
                    %s, péssimo você errou todas.
                    Po irmão, tá bom de ir pra casa já, isso não é pra você.
                    """, 
                    nome
                ));
        }else{
            System.out.println(String.format(
                    """
                    po %s, você acertou uma!
                    Voce é pessimo, melhore.
                    """, 
                    nome
                ));
        }
    }
    public static void encerrarQuiz(String nome){
        System.out.println(String.format(
            """
            Você foi um bom jogador %s
            Agora aperte ENTER para encerrar o jogo...
            """,
            nome
             ));
        SCAN.nextLine();
    }

}
