public class Cliente {
    private String nome;
    private Pedido pedido;

    Cliente(String nome, Pedido pedido){
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public Pedido getPedido() {
        return this.pedido;
    }
}
