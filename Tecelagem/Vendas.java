package tecelagem;
public class Vendas extends Funcionario
{
    private double totVendas;

    public Vendas(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totVendas= 0;
    }

    public double getTotVendas() {
        return totVendas;
    }

    public void registrarVenda(double valor)
    {
        totVendas+= valor;
    }
    
    public double comissao()
    {
        return totVendas * 0.03;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salBase + comissao();
    }
    
    @Override
    public void novoMes()
    {
        totVendas= 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Total de vendas: " + totVendas + "\n" +
                "Comissão: " + comissao());
    }
    
}
