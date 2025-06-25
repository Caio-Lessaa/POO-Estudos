package entities;

public class Shuriken {
    private String nome;

    public Shuriken(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Nome da shuriken: " + nome;
    }
}
