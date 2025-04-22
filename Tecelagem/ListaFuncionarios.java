package tecelagem;
public class ListaFuncionarios {
    private Funcionario listaFuncionarios[];
    private int quantidadeAtual;
    
    public ListaFuncionarios(int capacidadeMaxima){
        listaFuncionarios = new Funcionario[capacidadeMaxima];
        this.quantidadeAtual = 0;
    }
    
    public boolean addFunc(Funcionario f){
        if(quantidadeAtual <= listaFuncionarios.length){
            listaFuncionarios[quantidadeAtual] = f;
            this.quantidadeAtual++;
            return true;
        }
        return false;
    }
    
    public void relatorioAdministracao(){
        double salarioLiqTotal = 0;
        for(int i = 0; i <= quantidadeAtual; i++){
            if(listaFuncionarios[i] instanceof Administracao){
                salarioLiqTotal += ((Administracao)listaFuncionarios[i]).salarioLiquido();
                System.out.println("\nNome: " + listaFuncionarios[i].getNome() + "\nRG: " + listaFuncionarios[i].getRg() + "\nSalario Liquido: " + ((Administracao)listaFuncionarios[i]).salarioLiquido() + "\nFaltas: " + ((Administracao)listaFuncionarios[i]).getFaltas());
                
            }
        }
        System.out.println("\nSalario liquido total dos funcionarios da administracao: " + salarioLiqTotal);
    }
    
    public void relatorioVendas(){
        double totalVendas = 0;
        for(int i = 0; i <= quantidadeAtual; i++){
            if(listaFuncionarios[i] instanceof Vendas){
                totalVendas += ((Vendas)listaFuncionarios[i]).getTotVendas();
                System.out.println("\nNome: " + listaFuncionarios[i].getNome() + "\nRG: " + listaFuncionarios[i].getRg() + "\nTotal vendido: " + ((Vendas)listaFuncionarios[i]).getTotVendas());
            }
        }
        System.out.println("\nTotal de vendas do mes: " + totalVendas);
    }
    
    public void relatorioProducao(){
        int horasTotais = 0;
        for(int i = 0; i <= quantidadeAtual; i++){
            if(listaFuncionarios[i] instanceof Producao){
                horasTotais += (((Producao)listaFuncionarios[i]).getHrDia() + ((Producao)listaFuncionarios[i]).getHrNoite());
                System.out.println("\nNome: " + listaFuncionarios[i].getNome() + "\nRG: " + listaFuncionarios[i].getRg() + "\nHoras diurnas: " + ((Producao)listaFuncionarios[i]).getHrDia() + "\nHoras Noturnas: " + ((Producao)listaFuncionarios[i]).getHrNoite());
            }
        }
        System.out.println("\nTotal de horas trabalhadas dos funcionarios: " + horasTotais);
    }
    
}
