import entities.BolsaNinja;
import entities.Kunai;
import entities.Pergaminho;
import entities.Shuriken;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja();
        bolsaNinja.adicionarFerramenta(new Kunai(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Jutsu clone das sombras"));
        bolsaNinja.adicionarFerramenta(new Shuriken("Shuriken explosiva"));

        System.out.println("Itens da bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();
    }
}