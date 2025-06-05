public class ItensVendidos implements ItensEstoqueInt{
    private String descricao;
    private int tamanho;
    private double preco;
    private int qtdEstoque;

    public ItensVendidos(String descricao, int tamanho, double preco, int qtdEstoque){
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void incUnits(int qtd){
        this.qtdEstoque += qtd;
    }

    public boolean decUnits(int qtd){
        if(qtd > this.qtdEstoque){
            return false;
        }
        this.qtdEstoque -= qtd;
        return true;
    }

    public int getUnits(){
        return qtdEstoque;
    }

    public double getPrice(){
        return preco;
    }

    public void print(){
        System.out.println("DADOS DA PEÇA");
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " +qtdEstoque + "\n");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
