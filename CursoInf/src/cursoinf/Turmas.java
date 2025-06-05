package cursoinf;

public class Turmas {
    private String nomeCurso;
    private double qtdAulas;
    private Aluno[] lista = new Aluno[3];
    private int qtdAlunos;

    public Turmas(String nomeCurso, int qtdAulas) {
        this.nomeCurso = nomeCurso;
        this.qtdAulas = qtdAulas;
        this.qtdAlunos = 0;
    }
    
    public void matricularAluno(Aluno a1) throws Exception{
        if(qtdAlunos > 3) throw new ArrayIndexOutOfBoundsException();
        for(int i = 0; i < qtdAlunos; i++){
            if(lista[i].getCodigo() == a1.getCodigo()) throw new Exception();
        }
        lista[qtdAlunos] = a1;
        lista[qtdAlunos].setQtdFaltas(0);
        lista[qtdAlunos].setMediaFinal(0);
        qtdAlunos++;
    }
    
    public int buscarAluno(int codigo){
        for(int i = 0; i < qtdAlunos; i++){
            if(lista[i].getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }

    public double frequencia(Aluno a){
        return ((this.qtdAulas - a.getQtdFaltas()) / 80) * 100;
    }

    public void registrarFalta(int codigo){
        int indice = buscarAluno(codigo);
        lista[indice].setQtdFaltas((lista[indice].getQtdFaltas() + 1));
    }
    
    public void atribuirMedia(int codigo, double media){
        int indice = buscarAluno(codigo);
        if(media >= 0 && media <= 10){
            lista[indice].setMediaFinal(media);
        }
    }
       
    public void listarTodos(){
        System.out.println("\nListando todos os Alunos:");
        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("DADOS DO ALUNO:");
            System.out.println("Codigo do aluno: " + lista[i].getCodigo());
            System.out.println("Nome do Aluno: " + lista[i].getNome());
            System.out.println("Media final: " + lista[i].getMediaFinal());
            System.out.println("Quantidade de faltas: " + lista[i].getQtdFaltas());
            System.out.println("Curso: " + this.nomeCurso);
            System.out.println("Frequencia: " + frequencia(lista[i]) + "%\n");
        }
        System.out.println("---------------------------------------------------------");
    }
    
    public void listarAprovados(){
        System.out.println("Listando todos os Alunos aprovados no curso " + this.nomeCurso);
        for(int i = 0; i < qtdAlunos; i++){
            if(lista[i].getMediaFinal() >= 6 && ((this.qtdAulas - lista[i].getQtdFaltas()) / this.qtdAulas * 100) >= 75){
            System.out.println("\nDADOS DO ALUNO:");
            System.out.println("Codigo do aluno: " + lista[i].getCodigo());            
            System.out.println("Nome do Aluno: " + lista[i].getNome());
            System.out.println("Media final: " + lista[i].getMediaFinal());
            System.out.println("Quantidade de faltas: " + lista[i].getQtdFaltas());
            System.out.println("Curso: " + this.nomeCurso);
            System.out.println("Frequencia: " + frequencia(lista[i]) + "%\n");
            }
        }
        System.out.println("---------------------------------------------------------");
    }
}
