import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteVendaMain {
    public static void main(String[] args) {
        // Inicializando o cliente
        Cliente cliente = new Cliente("José Maria Marques", "123456", LocalDate.of(1996, 6, 10));

        // Inicializando os produtos
        Produto produto[] = new Produto[4];
        produto[0] = new Produto(1, "Produto 01", "Atributos do produto 1", 10.00);
        produto[1] = new Produto(2, "Produto 02", "Atributos do produto 2", 5.00);
        produto[2] = new Produto(3, "Produto 03", "Atributos do produto 3", 20.00);
        produto[3] = new Produto(4, "Produto 04", "Atributos do produto 4", 15.00);

        // Inicializando os itens de venda
        ItemVenda itemVendas[] = new ItemVenda[4];
        itemVendas[0] = new ItemVenda(10, produto[0]);
        itemVendas[1] = new ItemVenda(5, produto[1]);
        itemVendas[2] = new ItemVenda(10, produto[2]);
        itemVendas[3] = new ItemVenda(2, produto[3]);

        // Inicializando venda
        Venda venda = new Venda(LocalDate.of(2020, 12, 23), "Maria Dolores Sampaio", cliente);

        // Adicionando por iteração os itens na venda (a partir da função adicionarItem)
        int i;
        for (i = 0; i < 4; i++) {
            venda.adicionarItem(itemVendas[i]);
        }

        // Chamando a função listarItensVenda
        venda.listarItensVenda();


    }
}
