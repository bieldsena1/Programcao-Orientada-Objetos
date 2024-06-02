public class Carro implements Veiculo{
    private int velocidade = 0;
    private String marca;
    private String estilo;

    public Carro(String estilo){
        this.estilo = estilo;
    }
    public Carro(){
    }

    private void mostrarVelocidade(){
        System.out.println(String.format("%s estah a %s Km/h\n", this.estilo, this.velocidade));
    }

    @Override
    public void acelerar(){
        System.out.println("Greennnnnn!!");
        this.velocidade += 110;
        mostrarVelocidade();
    }

    @Override
    public void frear(){
        System.out.println("Reeeed!");
        this.velocidade = 00;
        mostrarVelocidade();
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getEstilo(){
        return this.estilo;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
}