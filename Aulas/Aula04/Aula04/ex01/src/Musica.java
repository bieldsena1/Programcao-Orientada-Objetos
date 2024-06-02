import java.util.ArrayList;


public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letra;
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void tocar(){
        for(int i = 0; i < musicos.size(); i++){
            musicos.get(i).tocarMusica();

            if(musicos.get(i).ehCantor){
                musicos.get(i).cantar();
            }
        }
    }

}
