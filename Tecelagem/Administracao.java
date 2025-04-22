package tecelagem;
public class Administracao extends Funcionario
{
    private int faltas;

    public Administracao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        faltas= 0;
    }

    public int getFaltas() {
        return faltas;
    }
    
    private double desconto()
    {
        return (salBase/30)*faltas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salBase- desconto();
    }
    
    @Override
    public void novoMes()
    {
        faltas= 0;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.format("Faltas: %d\nDesconto por faltas: %.2f\n", faltas, desconto());
    }
    
    
}
