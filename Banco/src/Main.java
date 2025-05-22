public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("720938474", 4320, 1500);

        c1.demonstrativo();
        c1.sacar(3500);
        c1.demonstrativo();
        c1.depositar(1300);
        c1.demonstrativo();
        c1.sacar(3621);
        c1.demonstrativo();
    }
}