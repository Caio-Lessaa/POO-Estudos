public class Main {
    public static void main(String[] args) {
        ItensLoja camisa = new ItensLoja("Camisa social branca", 'M', 54.21, 8);
        ItensLoja calca = new ItensLoja("Calça de sarja", 'M', 80.41, 5);
        ItensLoja jaqueta = new ItensLoja("Jaqueta de couro", 'G', 164.51, 4);
        ItensLoja bone = new ItensLoja("Boné GAP", 'U', 69.99, 7);
        ItensLoja tenis = new ItensLoja("Tênis nike", 'G', 229.99, 12);
        ListaItens lista = new ListaItens(4);
        System.out.println(lista.add(camisa));
        System.out.println(lista.add(calca));
        System.out.println(lista.add(jaqueta));
        System.out.println(lista.add(bone));
        System.out.println(lista.add(tenis));
        System.out.println(lista.add(tenis));
        lista.listAll();
    }
}