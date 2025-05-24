public class CarroConsignado extends Carro {
    private String nomeProprietario;
    private double valorDesejado;

    public CarroConsignado(int codigo, String placa, String modelo, String nomeProprietario, double valorDesejado) {
        super(codigo, placa, modelo);
        this.nomeProprietario = nomeProprietario;
        this.valorDesejado = valorDesejado;
    }

    @Override
    public boolean oferta(double valorOfertado) {
        if(valorOfertado > (valorDesejado += valorDesejado * 0.05)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean venderCarro(String vendedor, double valorVenda) {
        if(!oferta(valorVenda) || !disponivel()){
            return false;
        }else{
            setDisponivel(false);
            setVendedor(vendedor);
            return true;
        }
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Nome do proprietário do carro: " + nomeProprietario);
        System.out.println("Valor desejado para venda: " + valorDesejado);
        System.out.println("------------------------");
    }
}
