public class CarroProprio extends Carro {
    private double valorDaCompra;
    private String dataDaCompra;

    public CarroProprio(int codigo, String placa, String modelo, double valorDaCompra, String dataDaCompra){
        super(codigo, placa, modelo);
        this.valorDaCompra = valorDaCompra;
        this.dataDaCompra = dataDaCompra;
    }

    @Override
    public boolean oferta(double valorOfertado) {
        if(valorOfertado > (valorDaCompra += valorDaCompra * 0.1)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean venderCarro(String vendedor, double valorVenda) {
        if(!oferta(valorVenda) ||  !disponivel()){
            return false;
        }else{
            setDisponivel(false);
            setVendedor(vendedor);
            return true;
        }
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Valor pago pelo carro: " + valorDaCompra);
        System.out.println("Data da compra do carro: " + dataDaCompra);
        System.out.println("------------------------");
    }
}
