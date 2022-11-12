import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Venda {

    // Atributos
    private LocalDate data;
    private String atendente;
    List<ItemVenda> itens;
    private Cliente cliente;


    // Construtores
    public Venda(LocalDate data, String atendente, Cliente cliente) {
        setData(data);
        setAtendente(atendente);
        setCliente(cliente);
        this.itens = new ArrayList<>();
    }

    // Getters
    public LocalDate getData() {
        return data;
    }

    public String getAtendente() {
        return atendente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Setters
    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos
    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = itens.get(0).calcularTotal() + itens.get(1).calcularTotal() + itens.get(2).calcularTotal() + itens.get(3).calcularTotal();
        return total;
    }

    public void listarItensVenda() {
        // Declarando as variáveis que vão ser usadas na impressão
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate dataVenda = getData();
        String nomeCliente = getCliente().getNome();
        String cpfCliente = getCliente().getCpf();
        int idadeCliente = getCliente().calcularIdade();
        String atendente = getAtendente();

        // Fazendo impressão
        System.out.println("Data da Venda: " + formatter.format(dataVenda));
        System.out.printf("Cliente: %s | CPF: %s | Idade: %d\n", nomeCliente, cpfCliente, idadeCliente);
        System.out.printf("Atendente: %s\n\n", atendente);
        System.out.println("Nome do produto | Preço      | Quantidade | Total");
        System.out.println("-----------------------------------------------------\n");

        // Fazendo uma iteração sobre a lista de itens
        getItens().forEach(item -> {
            String nome = item.getProduto().getNome();
            double preco = item.getProduto().getPreco();
            int quantidade = item.getQuantidade();
            double total = item.calcularTotal();
            System.out.printf("%s      |   R$ %.2f |         %d | R$ %.2f\n", nome, preco, quantidade, total);
        });

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total da Venda:                            R$ %.2f", calcularTotal());
    }
}
