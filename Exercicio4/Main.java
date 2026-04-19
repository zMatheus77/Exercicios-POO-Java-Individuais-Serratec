public class Main {
    public static void main(String[] args) {
        try {
            CarroPasseio carro1 = new CarroPasseio("ABCD123", "Honda", 100.00, 2005, 50000.0);
            Caminhao caminhao1 = new Caminhao("ZYXW", "Volvo", 200.35, 2000, 245000.99, 12.5);

            System.out.println("O preço pra alugar o carro por 7 dias é de: " + carro1.alugarVeiculo(0.0, 7));
            System.out.println("O preço do IPVA do carro é: " + carro1.calcularIpva());

            System.out.println("O preço pra alugar o caminhão por 10 dias é: " + caminhao1.alugarVeiculo(-12.0, 10));
            System.out.println("O preço do IPVA do caminhão é: " + caminhao1.calcularIpva());

        } catch (NullPointerException e) {
            System.out.println("Erro na criação dos objetos, mensagem de erro: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Erro na criação dos objetos, mensagem de erro: " + e.getMessage());
        }
    }
}
