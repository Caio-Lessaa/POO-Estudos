package cursoinf;
public class Aluno {
    private int codigo;
    private String nome;
    private double mediaFinal;
    private int qtdFaltas;
    
    public Aluno(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.mediaFinal = 0;
        this.qtdFaltas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    
}
