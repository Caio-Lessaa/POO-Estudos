package tecelagem;
public class Tecelagem {
    public static void main(String[] args)
    {
        Funcionario a1= new Administracao("Alfredo", "123-4", 8230);
        ((Administracao)a1).registrarFalta();
        ((Administracao)a1).registrarFalta();
        
        Funcionario a2= new Administracao("Renato", "1653-4", 7800);
        ((Administracao)a2).registrarFalta();
        ((Administracao)a2).registrarFalta();
        
        Funcionario p1= new Producao("Maria", "234-5", 50);
        ((Producao)p1).registrarHorasDiurnas(100);
        ((Producao)p1).registrarHorasNoturnas(100);
        
        Funcionario v1= new Vendas("João", "345-6", 1000);
        ((Vendas)v1).registrarVenda(50000);
        ((Vendas)v1).registrarVenda(50000);

        Funcionario v2= new Vendas("Carlos", "723-2", 1500);
        ((Vendas)v2).registrarVenda(2300);
        ((Vendas)v2).registrarVenda(1700);

        ListaFuncionarios lista = new ListaFuncionarios(6);
        lista.addFunc(a1);
        lista.addFunc(a2);
        lista.addFunc(v1);
        lista.addFunc(v2);
        lista.addFunc(p1);
        lista.relatorioAdministracao();
        lista.relatorioVendas();
        lista.relatorioProducao();
    }
    
}
