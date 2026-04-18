import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itensPedidos = new ArrayList<>();
    private Double total = 0.0;

    public void adicionarItens(ItemPedido item){
        itensPedidos.add(item);
    }

    private void calcularTotal(){
        for(int i = 0; i < itensPedidos.size(); i++){
            total += itensPedidos.get(i).getSubtotal();
        }
    }

    private String reciboDetalhado(Double frete){
        StringBuilder recibo = new StringBuilder();

        recibo.append("--------------------------------------------\n");
        for(int i = 0; i < itensPedidos.size(); i++){
            recibo.append(itensPedidos.get(i).toString());
        }

        if(frete > 0){
            recibo.append(String.format("Frete: R$%.2f\n", frete));
            total += frete;
        }

        recibo.append(String.format("\nTotal: R$%.2f\n", total));
        recibo.append("--------------------------------------------\n\n");
        return recibo.toString();
    }

    public void fecharPedido(){
        calcularTotal();
        if(total > 250){
            System.out.println("Você ganhou frete grátis. Recibo detalhado abaixo:");
            System.out.print(reciboDetalhado(0.0));
        }
        else{
            System.out.println("Frete será de R$25,00. Recibo detalhado abaixo:");
            System.out.printf("%s", reciboDetalhado(25.0));

        }
    }
}
