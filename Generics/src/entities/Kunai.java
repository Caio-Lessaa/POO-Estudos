package entities;

public class Kunai {
    private int tamanho;

    public Kunai(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return tamanho;
    }

    @Override
    public String toString() {
        return "Tamanho da kunai: " + tamanho;
    }
}
