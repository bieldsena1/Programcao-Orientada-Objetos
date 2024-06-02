
public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("fusquinha");
        carro.setMarca("Volkswagen");
        System.out.println("Marca: " + carro.getMarca());
        carro.frear();

        Van van = new Van("Van monstra bglh doido");
        van.setMarca("Volkswagen");
        System.out.println("Marca: " + van.getMarca());
        van.acelerar(); 

    }
}