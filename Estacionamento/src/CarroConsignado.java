public class CarroConsignado extends Carro {

    private String nomeProprietario;
    private double preco;

    public CarroConsignado(int codigo, String placa, int anoFabricacao, String modelo, String nomeProprietario, double preco) {
        super(codigo, placa, anoFabricacao, modelo);
        this.nomeProprietario = nomeProprietario;
        this.preco = preco;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
    public void imprimeDados() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano da fabricacao: " + getAnoFabricacao());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Disponível: " + (getDisponivel() ? "Sim" : "Não"));
        System.out.println("Nome do proprietário: " + nomeProprietario);
        System.out.println("Preço: " + preco);
    }

    @Override
    public boolean oferta(double valor) {
        return valor > preco * 1.05;
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
