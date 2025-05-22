import javax.sound.midi.Soundbank;

public class ContaCorrente extends Conta{
    private double chequeEspecial;
    private double juros;

    public ContaCorrente(String cpf, double saldo, double chequeEspecial){
        super(cpf, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        if(chequeEspecial > 0){
            this.chequeEspecial = chequeEspecial;
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= (this.saldo + this.chequeEspecial)){
            this.saldo -=valor;
            totalSaques +=valor;
            return true;
        }else{
            return false;
        }
    }

    public void atualizar(double taxa){
        if(this.saldo >= 0){

        }else{
            this.juros += this.saldo * (taxa/100); //no caso a taxa tem que ser passada em porcentagem, por exemplo, se for 15 por cento a taxa vai receber o valor 15
        }
    }

    public void fecharMes(){
        this.saldo -= this.juros;
        this.juros = 0;
    }

    public void demonstrativo(){
        super.demonstrativo();
        System.out.println("Tipo da conta: Corrente");
        System.out.println("Juros da conta: " + this.juros);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Saldo após o fechamento: " + (this.saldo - this.juros));
    }
}
