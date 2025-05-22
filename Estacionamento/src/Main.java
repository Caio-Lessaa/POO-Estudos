public class Main {
    public static void main(String[] args) {
        CarroProprio carroProprio1 = new CarroProprio(21, "ASJ-7812", 2020, "Golf GTI", 50.701, "21/12/2022");
        System.out.println("Carro Proprio: ");
        carroProprio1.imprimeDados();
        System.out.println("Vender carro próprio:");
        System.out.println(carroProprio1.venderCarro("Alfredo", 58.000));

        CarroConsignado carroConsignado1 = new CarroConsignado(32, "AFD-7629", 1980, "Opala", "Carlos Alberto", 30.001);
        /*System.out.println("Carro Consignado: ");
        carroConsignado1.imprimeDados();
        System.out.println("Vender carro consignado:");
        System.out.println(carroConsignado1.venderCarro("Benedito", 31.001));
        System.out.println("Oferta aceita?: " + carroConsignado1.oferta(31.001)); */
    }
}