public class CarroConsignado extends Carro{
    private String nomeProprietario;
    private double preco;

    public CarroConsignado(int codigo, String placa, String anoDeFabricacao, String modelo, String nomeProprietario, double preco){
        super(codigo, placa, anoDeFabricacao, modelo);
        this.nomeProprietario = nomeProprietario;
        this.preco = preco;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Nome do proprietário: " + nomeProprietario);
        System.out.println("Preço desejado: " + preco);
    }

    @Override
    public boolean oferta(double valor) {
        if(valor >= preco * 1.05){
            return true;
        }else
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
