public class Produto {
    // Atributos
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    // Construtores
    public Produto(int codigo, String nome, String descricao, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
