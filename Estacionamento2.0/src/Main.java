public class Main {
    public static void main(String[] args) {
        CarroProprio cp = new CarroProprio(10, "AJC-2376", "28/04/2021", "VW Polo", 67.001, "21/01/2022");
        CarroConsignado cc = new CarroConsignado(11, "QQW=3847", "28/11/2002", "VW Jetta", "Pablin", 95.553);
        cp.imprimeDados();
        cc.imprimeDados();

        System.out.println(cc.venderCarro("Adalberto", 110.255) ? "Vendido" : "Oferta não aceita");

        System.out.println(cp.venderCarro("Roberto", 70.001) ? "Vendido" : "Oferta não aceita");

        System.out.println(cc.venderCarro("Adalberto", 110.255) ? "Vendido" : "Oferta não aceita");
    }
}