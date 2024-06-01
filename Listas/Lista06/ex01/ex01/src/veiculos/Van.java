public class Van implements Veiculo{
    private int velocidade = 0;
    private String marca;
    private String estilo;

    public Van(String estilo){
        this.estilo = estilo;
    }
    public Van(){
    }

    private void mostrarVelocidade(){
        System.out.println(String.format("%s a velodidade eh de  %s Km/h\n", this.estilo, this.velocidade));
    }

    @Override
    public void acelerar(){
        System.out.println("greeeeeen!!");
        this.velocidade += 110;
        mostrarVelocidade();
    }

    @Override
    public void frear(){
        System.out.println("reeeeeed!");
        this.velocidade = 0;
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