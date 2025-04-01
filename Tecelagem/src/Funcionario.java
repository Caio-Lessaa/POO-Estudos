public abstract class Funcionario{
    private String nome;
    private String rg;
    protected double salarioBase;

    public Funcionario(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }

    public abstract double salarioLiquido();

    public void hollerith(){
        System.out.format("\nDados do funcionário: \n");
        System.out.println("Nome: "  + nome);
        System.out.println("RG: "  + rg);
        System.out.println("Salário Base: "  + salarioBase);
    }

    public abstract void novoMes();
}
