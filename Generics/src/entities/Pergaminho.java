package entities;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo){
        this.conteudo = conteudo;
    }

    public String getConteudo(){
        return conteudo;
    }

    @Override
    public String toString() {
        return "Conteúdo do pergaminho: " + conteudo;
    }
}
