package cursoinf;
public class CursoInf {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Caio");
        Aluno a2 = new Aluno(2, "Luiz Otavio");
        Aluno a3 = new Aluno(3, "Gabriel");
        Aluno a4 = new Aluno(4, "Paulo");
        Turmas t1 = new Turmas("ADS", 80);
        
        try {
            t1.matricularAluno(a1);
            t1.matricularAluno(a2);
            t1.matricularAluno(a2);
            t1.matricularAluno(a4);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Quantidade máxima de alunos da turma ultrapassada!");
        }catch (Exception e) {
            System.out.println("Código já cadastrado na turma!");
        }

        try {
            t1.atribuirMedia(1, 5);
            t1.atribuirMedia(2, 10);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O código informado não existe.");
        }

        try {
            t1.registrarFalta(1);
            t1.registrarFalta(1);
            t1.registrarFalta(1);
            t1.registrarFalta(1);
            t1.registrarFalta(2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("O código informado para registrar faltas não existe.");
        }

        t1.listarTodos();
        
        t1.listarAprovados();
    }
}
