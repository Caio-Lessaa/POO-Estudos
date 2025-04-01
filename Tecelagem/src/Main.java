public class Main {
    public static void main(String[] args) {
        Administrativo adm1 = new Administrativo("Caio", "73972039", 2800);
        Producao prod1 = new Producao("Roberto", "30485763", 35);
        Vendas vend1 = new Vendas("Aline", "02745385", 2500);

        // Funcionário do administrativo
        adm1.registraFaltas();
        adm1.registraFaltas();
        adm1.registraFaltas();
        adm1.hollerith();
        adm1.novoMes();
        adm1.hollerith();

        // Funcionário da produção
        prod1.registrarHorasDiurnas(100);
        prod1.registrarHorasNoturnas(30);
        prod1.hollerith();
        prod1.novoMes();
        prod1.hollerith();

        // Funcionário de vendas
        vend1.registrarVenda(15000);
        vend1.registrarVenda(30000);
        vend1.hollerith();
        vend1.novoMes();
        vend1.hollerith();
    }
}