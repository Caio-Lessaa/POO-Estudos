public class Vendas extends Funcionario{
    private double valorVenda = 0;

    public Vendas(String nome, String rg, double salarioBase){
        super(nome, rg, salarioBase);
    }

    public void registrarVenda(double valorVenda){
        this.valorVenda += valorVenda;
    }

    public double comissao(){
        return this.valorVenda * 0.03;
    }

    public double salarioLiquido(){
        return this.salarioBase + comissao();
    }

    public void hollerith(){
        super.hollerith();
        System.out.println("Valor total de vendas no mês: " + this.valorVenda);
        System.out.println("Valor da comissão: " + comissao());
        System.out.println("Salário Líquido: " + salarioLiquido());
    }

    public void novoMes(){
        this.valorVenda = 0;
    }
}
