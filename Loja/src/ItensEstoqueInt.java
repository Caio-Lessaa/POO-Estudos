public interface ItensEstoqueInt {
    void incUnits(int qtd);
    boolean decUnits(int qtd);
    int getUnits();
    double getPrice();
    void print();
}
