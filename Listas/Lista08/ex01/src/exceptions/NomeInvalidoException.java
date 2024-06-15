package exceptions;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("Coloque um nome maior.");
    }
}