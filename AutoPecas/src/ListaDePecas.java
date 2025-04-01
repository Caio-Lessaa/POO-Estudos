import java.util.ArrayList;
public class ListaDePecas implements ListaControl{
    ArrayList<Peca> listaPecas = new ArrayList<Peca>();
    @Override
    public int adicionarPeca(Peca pc) {
        listaPecas.add(pc);
        if (listaPecas.contains(pc)){
            pc.getCodigo();
            pc.getDescricao();
            pc.getQtdEstoque();
            pc.getPeso();
        }
        return listaPecas.size() -1;
    }

    @Override
    public boolean retirarUnidades(int index, int quantidade) {
        if(listaPecas.get(index).getQtdEstoque() > quantidade){
            listaPecas.get(index).setQtdEstoque(listaPecas.get(index).getQtdEstoque() - quantidade);
            return true;
        }else if(listaPecas.get(index).getQtdEstoque() < quantidade){
            //System.out.println("A quantidade de peças para remoção ultrapassa a quantidade de estoque.");
            return false;
        }else{
            //System.out.println("O índice indicado não existe.");
            return false;
        }

    }

    @Override
    public boolean acrescentarUnidades(int index, int quantidade) {
        listaPecas.get(index).setQtdEstoque(listaPecas.get(index).getQtdEstoque() + quantidade);
        if(listaPecas.get(index).getQtdEstoque() == listaPecas.get(index).getQtdEstoque() + quantidade){
            //System.out.println("Quantidade da peça adicionada ao estoque.");
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean imprimirPeca(int index) {
        if(index >= 0 && index < listaPecas.size()){
            System.out.println("Código da peça: " + listaPecas.get(index).getCodigo());
            System.out.println("Descrição da peça: " + listaPecas.get(index).getDescricao());
            System.out.println("Quantidade da peça em estoque: " + listaPecas.get(index).getQtdEstoque());
            System.out.println(listaPecas.get(index).getPeso());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void relatorioGeral() {
        for (int i = 0; i < listaPecas.size(); i++){
            System.out.printf("Informações da peça %d\n", i+1);
            System.out.println(listaPecas.get(i).getCodigo());
            System.out.println(listaPecas.get(i).getDescricao());
            System.out.println(listaPecas.get(i).getQtdEstoque());
            System.out.println(listaPecas.get(i).getPeso());
        }
    }

    @Override
    public void relatorioReposicao(int qtdMinima) {

    }
}
