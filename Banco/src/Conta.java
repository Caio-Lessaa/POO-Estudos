public abstract class Conta {
    private String cpf;
    protected double saldo;
    protected double totalSaques;
    protected double totalDepositos;

    public Conta(String cpf, double saldo){
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public abstract boolean sacar(double valor);

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            this.totalDepositos =+ valor;
        }else{
            System.out.println("Valor inválido");
        }
    }

    public abstract void atualizar(double taxa);

    public abstract void fecharMes();

    public void demonstrativo(){
        System.out.println("\nDADOS DA CONTA:");
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
    }
}
