public class ItemVenda{

    // Atributo
    private int quantidade;
    private Produto produto;

    // Construtor
    public ItemVenda(int quantidade, Produto produto) {
        setQuantidade(quantidade);
        setProduto(produto);
    }

    // Métodos

    // Getter
    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    // Setter
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularTotal() {
        double valor = getProduto().getPreco() * getQuantidade();
        return valor;
    }
}
