public class CarroProprio extends Carro {

    private double valorCompra;
    private String dataCompra;

    public CarroProprio(int codigo, String placa, int anoFabricacao, String modelo, double valorCompra, String dataCompra) {
        super(codigo, placa, anoFabricacao, modelo);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }


    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }


    @Override
    public boolean disponivel() {
        if(getDisponivel() == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void imprimeDados(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano da fabricacao: " + getAnoFabricacao());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Disponível: " + (getDisponivel() ? "Sim" : "Não"));
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Data da compra: " + dataCompra);
    }

    @Override
    public boolean oferta(double valor) {
        if(valor > valorCompra * 1.1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean venderCarro(String vendedor, double valorVenda) {
        if(!getDisponivel() || !oferta(valorVenda)){
            return false;
        }
        setVendedor(vendedor);
        setDisponivel(false);
        return true;
    }
}
