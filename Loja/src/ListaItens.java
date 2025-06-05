public class ListaItens{
    private ItensVendidos[] listaItens;
    private int qtdAtual;

    public ListaItens(int tamanhoLista){
        listaItens = new ItensVendidos[tamanhoLista];
        this.qtdAtual = 0;
    }

    public int add(ItensVendidos item){
        if(qtdAtual < listaItens.length){
            listaItens[qtdAtual] = item;
            qtdAtual++;
            return qtdAtual - 1;
        }else{
            return -1;
        }
    }

    public boolean incUnits(int index, int qtd){
        int quantidade = listaItens[index].getUnits();
        listaItens[index].incUnits(qtd);
        int qtdAtualizada = listaItens[index].getUnits();
        if(qtdAtualizada > quantidade){
            return true;
        }else{
            return false;
        }
    }

    public boolean decUnits(int index, int qtd){
        if(listaItens[index].decUnits(qtd)){
            return true;
        }else{
            return false;
        }
    }

    public void listaAll(){
        System.out.println("ITENS CADASTRADOS NA LISTA");
        double valorTotalEstoque = 0;
        for(int i = 0; i < qtdAtual; i++){
            listaItens[i].print();
            valorTotalEstoque += (listaItens[i].getPrice() * listaItens[i].getUnits());
        }
        System.out.println("Soma total dos valores dos itens disponiveis no estoque: " + valorTotalEstoque);
    }
}
