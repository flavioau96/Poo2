import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("Primeira Categoria");
        Categoria categoria2 = new Categoria("Segunda Categoria");

        Produto produto1 = new Produto("Flávio", 25.0, "Tia JU", 15, categoria1);
        Produto produto2 = new Produto("Brocolis", 18.0, "Gourmet", 36, categoria2);
        Produto produto3 = new Produto("Tomate", 3.99, "Da roça", 77, categoria1);
        Produto produto4 = new Produto("Cenoura", 4.32, "Das bruta", 23, categoria2);
        Produto produto5 = new Produto("Alface", 5.99, "Sem agrotoxico", 27, categoria1);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);


        Date dataAtual = new Date();
        Pedido pedido1 = new Pedido(1, dataAtual, 150, 1);
        Pedido pedido2 = new Pedido(2, dataAtual, 110, 2);


        PedidoItem item1Pedido1 = new PedidoItem("Primeiro Item do Pedido 1", 2, 0, produto1);
        PedidoItem item2Pedido1 = new PedidoItem("Segundo Item do Pedido 1", 3, 0, produto2);
        PedidoItem item3Pedido2 = new PedidoItem("Primeiro Item do Pedido 2", 1, 0, produto3);
        PedidoItem item4Pedido2 = new PedidoItem("Segundo Item do Pedido 2", 4, 0, produto4);

        if (listaProdutos.contains(item1Pedido1.getProduto()) &&
                listaProdutos.contains(item2Pedido1.getProduto()) &&
                listaProdutos.contains(item3Pedido2.getProduto()) &&
                listaProdutos.contains(item4Pedido2.getProduto())) {

            pedido1.inserirItensPedido(item1Pedido1);
            pedido1.inserirItensPedido(item2Pedido1);
            pedido2.inserirItensPedido(item3Pedido2);
            pedido2.inserirItensPedido(item4Pedido2);

            item1Pedido1.atualizarEstoqueItem();
            item2Pedido1.atualizarEstoqueItem();
            item3Pedido2.atualizarEstoqueItem();
            item4Pedido2.atualizarEstoqueItem();

            pedido1.alterarStatus(2);
            pedido2.alterarStatus(2);

            pedido1.setPrecoTotal(pedido1.calcularTotalPagar());
            pedido2.setPrecoTotal(pedido2.calcularTotalPagar());

            System.out.println("Produtos que estão Cadastrados:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto.getNomeProduto());
            }

            System.out.println("\nItens do Pedido 1:");
            for (PedidoItem item : pedido1.getItensPedido()) {
                System.out.println("Nome do Item: " + item.getNomeItem() + ", Quantidade: " + item.getQtdeItem());
            }
            System.out.println("O total do Pedido 1 é: " + pedido1.getPrecoTotal());

            System.out.println("\nEstes são os itens do pedido 2:");
            for (PedidoItem item : pedido2.getItensPedido()) {
                System.out.println("Nome do Item: " + item.getNomeItem() + ", Quantidade: " + item.getQtdeItem());
            }
            System.out.println("O total do Pedido 2 é: " + pedido2.getPrecoTotal());
        } else {
            System.out.println("Na sua lista não tem estes pedidos");
        }
    }
}
////Flavio Augusto Carvalho