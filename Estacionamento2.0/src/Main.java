public class Main {
    public static void main(String[] args) {
        CarroProprio cp = new CarroProprio(10, "AJC-2376", "28/04/2021", "VW Polo", 67.001, "21/01/2022");
        cp.imprimeDados();

        System.out.println(cp.oferta( 69.901));

        System.out.println(cp.venderCarro("Roberto", 70.001));
    }
}