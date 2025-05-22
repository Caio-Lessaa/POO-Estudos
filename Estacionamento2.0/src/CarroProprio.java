public class CarroProprio extends Carro{
    private double valorCompra;
    private String dataCompra;

    public CarroProprio(int codigo, String placa, String anoDeFabricacao, String modelo, double valorCompra, String dataCompra){
        super(codigo, placa, anoDeFabricacao, modelo);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Data da compra: " + dataCompra);
    }

    @Override
    public boolean oferta(double valor) {
        if (valor >= valorCompra * 1.10) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean venderCarro(String vendedor, double valorVenda) {
        if (oferta(valorVenda) && disponivel()){
            setDisponivel(false);
            setVendedor(vendedor);
            return true;
        }
        else
            return false;
    }
}
