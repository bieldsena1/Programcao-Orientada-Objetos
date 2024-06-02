public class Gato implements Animal{
    private String cor;
    private int braveza;

    public Gato(String cor, int braveza){
        this.cor = cor;
        this.braveza = braveza;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setBraveza(int braveza){
        this.braveza = braveza;
    }
    public double getBraveza(){
        return this.braveza;
    }

    @Override
    public void comer(){
        System.out.println(String.format("Gato %s comendo...", cor));
        this.braveza++;
        System.out.println(String.format("Gato estah bravo %s corre daí!", braveza));
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau.");
    }
}