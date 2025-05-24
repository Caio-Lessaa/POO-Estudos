public class ListaCarros {
    private Carro[] lista;
    private int qtdAtual;

    public ListaCarros(int capacidadeMaxima) {
        this.lista = new Carro[capacidadeMaxima];
        this.qtdAtual = 0;
    }

    private Carro getCarro(int codigo) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == codigo) {
                lista[i].imprimeDados();
                return lista[i];
            }
        }
        return null;
    }


    public boolean addCarro(Carro car) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == car.getCodigo()){
                return false;
            }
        }

        lista[qtdAtual++] = car;
        return true;
    }

    public boolean disponivel(int codigo) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == codigo){
                return lista[i].isDisponivel();
            }
        }
        return false;
    }

    public void imprimeDados(int codigo) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == codigo){
                lista[i].imprimeDados();
            }
        }
    }

    public boolean oferta(int codigo, double valor) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == codigo){
                return lista[i].oferta(valor);
            }
        }
        return false;
    }

    public boolean venderCarro(int codigo, String vendedor, double valorVenda) {
        for(int i = 0; i < qtdAtual; i++){
            if(lista[i].getCodigo() == codigo){
                return lista[i].venderCarro(vendedor, valorVenda);
            }
        }
        return false;
    }

    public void listagem(String title, boolean all, boolean disponivel) {
        if(all){
            System.out.println(title);
            for(int i = 0; i < qtdAtual; i++){
                lista[i].imprimeDados();
            }
        }else{
            if(disponivel){
                System.out.println(title);
                for(int i = 0; i < qtdAtual; i++){
                    if(lista[i].isDisponivel()){
                        lista[i].imprimeDados();
                    }
                }
            }else{
                System.out.println(title);
                for(int i = 0; i < qtdAtual; i++){
                    if(!lista[i].isDisponivel()){
                        lista[i].imprimeDados();
                    }
                }
            }
        }
    }
}
