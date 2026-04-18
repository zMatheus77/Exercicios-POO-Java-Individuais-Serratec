public class Main {
    public static void main(String[] args) {
        ItemPedido item1 = new ItemPedido("Biscoito", 3, 4.00);
        ItemPedido item2 = new ItemPedido("Refrigerante", 2, 7.99);
        ItemPedido item3 = new ItemPedido("Energético", 5, 10.0);
        ItemPedido item4 = new ItemPedido("Cerveja", 4, 8.0);
        ItemPedido item5 = new ItemPedido("Picanha", 3, 80.0);
        
        Pedido pedido1 = new Pedido();
        pedido1.adicionarItens(item1);
        pedido1.adicionarItens(item2);


        Cliente cliente1 = new Cliente("Matheus", pedido1);
        cliente1.getPedido().fecharPedido();

        
        Pedido pedido2 = new Pedido();
        pedido2.adicionarItens(item1);
        pedido2.adicionarItens(item4);
        pedido2.adicionarItens(item5);
        pedido2.adicionarItens(item3);

        Cliente cliente2 = new Cliente("Matthew", pedido2);
        cliente2.getPedido().fecharPedido();
    }
}
