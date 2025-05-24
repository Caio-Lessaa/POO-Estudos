public class Main {
    public static void main(String[] args) {
        CarroProprio carroProprio = new CarroProprio(1, "ASD-8973", "VW Golf", 65000.00, "24/02/2025");
        CarroConsignado carroConsignado = new CarroConsignado(2, "KJH-8978", "Ford Ka", "Caio", 40000.00);

        /*System.out.println(carroProprio.venderCarro("Roberto", 65000.00) ? "Carro vendido com sucesso!" : "Oferta não aceita ou carro não disponível");
        carroProprio.imprimeDados();*/

        ListaCarros listaCarros = new ListaCarros(2);
        listaCarros.addCarro(carroProprio);
        listaCarros.addCarro(carroConsignado);
        System.out.println(listaCarros.disponivel(1) ? "Está disponível" : "Não está disponível");
        System.out.println(listaCarros.venderCarro(1,"Roberto", 72000.00) ? "Carro vendido com sucesso" : "Oferta não aceita ou carro não disponível");
        System.out.println(listaCarros.disponivel(1) ? "Está disponível" : "Não está disponível");
        listaCarros.listagem("\nCarros vendidos:", true, true);
        System.out.println(listaCarros.oferta(2, 47000.00) ? "Oferta aceita" : "Oferta não aceita ou carro não disponível");

    }
}