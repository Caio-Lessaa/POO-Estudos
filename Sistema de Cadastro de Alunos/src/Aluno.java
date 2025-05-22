import javax.swing.JOptionPane;
public class Aluno {
    private String nome;
    private String ra;
    private String curso;
    private float nota1;
    private float nota2;
    private boolean aprovado;

    public Aluno(String nome, String ra, String curso){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.aprovado = false;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMediaFinal() {
        if((nota1 + nota2) / 2 >= 6){
            this.aprovado = true;
        }
        return (nota1 + nota2) / 2;
    }

    public boolean getAprovado(){
        return this.aprovado;
    }

    public void exibirDados(){
        String dados = "DADOS DO ALUNO:\n" + "Nome: " + nome + "\n" + "RA: " + ra + "\n" + "Curso: " + curso + "\n" + "Nota da primeira avaliação: " + nota1 + "\n" + "Nota da segunda avaliação: " + nota2 + "\n" + "Média Final: " + getMediaFinal() + "\n" + "Aprovado: " + (aprovado ? "Sim":"Não");

        JOptionPane.showMessageDialog(null, dados);
    }
}
