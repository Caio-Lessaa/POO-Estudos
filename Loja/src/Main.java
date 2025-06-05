public class Main {
    public static void main(String[] args) {
        ItensVendidos camisa = new ItensVendidos("Camisa de botao", 14, 50.25, 10);
        ItensVendidos calca = new ItensVendidos("Calça jeans", 40, 110.98,5);
        ItensVendidos tenis = new ItensVendidos("Tenis nike", 41, 249.99, 4);
        ItensVendidos meia = new ItensVendidos("Meia adidas", 40, 39.99, 6);

        ListaItens listaItens = new ListaItens(3);

        System.out.println(listaItens.add(camisa));
        System.out.println(listaItens.add(calca));
        System.out.println(listaItens.add(tenis));
        System.out.println(listaItens.add(meia));

        listaItens.listaAll();
    }
}