public abstract class Carro {
    private int codigo;
    private String placa;
    private String modelo;
    private boolean disponivel;
    private String vendedor;

    public Carro(int codigo, String placa, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.modelo = modelo;
        this.disponivel = true;
        this.vendedor = " ";
    }

    public boolean disponivel() {
        return disponivel;
    }

    public void imprimeDados(){
        System.out.println("\nDADOS DO VEÍCULO:");
        System.out.println("Código: " + codigo);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        if(!disponivel){
            System.out.println("Vendedor: " + vendedor);
        }
    }

    public abstract boolean oferta(double valorOfertado);

    public abstract boolean venderCarro(String vendedor, double valorVenda);

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
}
