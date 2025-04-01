public abstract class Carro {
    private int codigo;
    private String placa;
    private int anoFabricacao;
    private String modelo;
    private boolean disponivel;
    private String Vendedor;

    public Carro(int codigo, String placa, int anoFabricacao, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.disponivel = true;
        this.Vendedor = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String vendedor) {
        Vendedor = vendedor;
    }

    public abstract boolean disponivel();

    public abstract void imprimeDados();

    public abstract boolean oferta(double valor);

    public abstract boolean venderCarro(String vendedor, double valorVenda);
}
