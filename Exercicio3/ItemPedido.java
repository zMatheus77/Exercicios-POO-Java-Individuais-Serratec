public class ItemPedido {
    private String nomeItem;
    private Integer quantidade;
    private Double precoUnitario;

     ItemPedido(String nomeItem, Integer quantidade, Double precoUnitario){
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Double getSubtotal(){
        return precoUnitario * quantidade;
    }

    @Override
    public String toString(){
        return this.quantidade + "x " + this.nomeItem + 
        String.format(" R$%.2f = R$%.2f\n", this.precoUnitario, getSubtotal());
    }
    
   
}
