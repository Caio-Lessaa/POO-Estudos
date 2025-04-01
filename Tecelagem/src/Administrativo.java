public class Administrativo extends Funcionario {
    private int faltas = 0;

    public Administrativo(String nome, String rg, double salarioBase){
        super(nome, rg, salarioBase);
    }

    public void registraFaltas(){
        this.faltas++;
    }

    public double desconto(){
        return (salarioBase / 30) * faltas;
    }

    @Override
    public double salarioLiquido(){
        return salarioBase - desconto();
    }

    @Override
    public void novoMes(){
        this.faltas = 0;
    }

    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Faltas: " + this.faltas);
        System.out.println("Desconto: " + desconto());
        System.out.println("Salário Líquido: " + salarioLiquido());
    }
}
