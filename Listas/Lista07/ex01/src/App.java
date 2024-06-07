import escola.Aluno;
import escola.Professor;
public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Aluno", "aluno@gmail.com", "True");
        Professor professor = new Professor("Professor", "professor@gmail.com", "artes");

        aluno.exibirInfo(true, true, true);
        System.out.println("\n");
        professor.exibirInfo(true, true, true); 
    }
}
