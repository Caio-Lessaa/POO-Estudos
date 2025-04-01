public abstract class Carro {
    private int codigo;
    private String placa;
    private String anoDeFabricacao;
    private String modelo;
    private boolean disponivel;
    private String vendedor;

    public Carro(int codigo, String placa, String anoDeFabricacao, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
        this.disponivel = true;
        this.vendedor = "";
    }

    public boolean disponivel(){
        if (disponivel)
            return true;
        else
            return false;
    }

    public void imprimeDados(){
        System.out.println("Dados do carro: ");
        System.out.println("Código: " + codigo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Modelo: " + modelo);
    }

    public abstract boolean oferta(double valor);

    public abstract boolean venderCarro(String vendedor, double valorVenda);

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
}
