public class ItensLoja implements ItemEstoqueInt{
    private String descricao;
    private char tamanho;
    private double preco;
    private int qtdEstoque;

    public ItensLoja(String descricao, char tamanho, double preco, int qtdEstoque){
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void incUnits(int qtd){
        this.qtdEstoque += qtd;
    }

    public void decUnits(int qtd){
        if(qtdEstoque > qtd){
            this.qtdEstoque -= qtd;
        }
    }

    public int getUnits(){
        return this.qtdEstoque;
    }

    public double getPrice(){
        return this.preco;
    }

    public void print(){
        System.out.println("\nDADOS DA PEÇA");
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho " + tamanho);
        System.out.println("Preço " + preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque);
    }
}
