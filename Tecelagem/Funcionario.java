package tecelagem;
public abstract class Funcionario
{
    private String nome, rg;
    protected double salBase;
    
    public Funcionario(String nome, String rg, double salBase)
    {
        this.nome= nome;
        this.rg= rg;
        this.salBase= salBase;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }
    
    public abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.format("\nNome: %s\nRG: %s\nSalário Base: %.2f\nSalário líquido: %.2f\n", nome, rg, salBase, salarioLiquido());
    }
}
