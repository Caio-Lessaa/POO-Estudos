public class Producao extends Funcionario{
    private int horasDia = 0;
    private int horasNoite = 0;

    public Producao(String nome, String rg, double salarioBase){
        super(nome, rg, salarioBase);
    }

    public void registrarHorasDiurnas(int horasDia){
        this.horasDia += horasDia;
    }

    public void registrarHorasNoturnas(int horasNoite){
        this.horasNoite += horasNoite;
    }

    public double valorDiurno(){
        return salarioBase * horasDia;
    }

    public double valorNoturno(){
        return (salarioBase * horasNoite) * 1.3;
    }

    public double salarioLiquido(){
        return valorDiurno() + valorNoturno();
    }

    public void hollerith(){
        super.hollerith();
        System.out.println("Valor diurno: " + valorDiurno());
        System.out.println("Valor noturno: " + valorNoturno());
        System.out.println("Salario Liquido: " + salarioLiquido());
    }

    public void novoMes(){
        this.horasDia = 0;
        this.horasNoite = 0;
    }
}
