public class ListaItens {
    private ItemEstoqueInt lista[];
    private int contador;

    public ListaItens(int tamanhoLista){
        this.lista = new ItemEstoqueInt[tamanhoLista];
        this.contador = 0;
    }

    public int add(ItemEstoqueInt item){
        if(contador < lista.length){
            lista[contador] = item;
            contador++;
            return contador -1;
        }else{
            return -1;
        }
    }

    public boolean incUnits(int index, int qtd){
        if(index >= 0 && index < contador){
            lista[index].incUnits(qtd);
            return true;
        }else{
            return false;
        }
    }

    public boolean decUnits(int index, int qtd){
        if(index >= 0 && index < contador){
            lista[index].decUnits(qtd);
            return true;
        }else{
            return false;
        }
    }

    public void listAll(){
        double valorTotalEstoque = 0;
        for(int i =0; i < contador; i++){
            lista[i].print();
            valorTotalEstoque += lista[i].getPrice() * lista[i].getUnits();
        }
        System.out.println("Valor total dos itens do estoque: " + valorTotalEstoque);
    }


}
