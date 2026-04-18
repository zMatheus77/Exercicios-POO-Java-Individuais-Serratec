import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0, saquesRestantes = 3;
        double saldo = 0, valorSaque = 0, valorDepositar = 0;

        do { 
            System.out.println("\n\t-------------------------------------");
            System.out.println("\t1 - Ver Saldo");
            System.out.println("\t2 - Depositar");
            System.out.println("\t3 - Sacar");
            System.out.println("\t0 - Sair");
            System.out.println("\t-------------------------------------");

            System.out.print("\n------: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é de R$%.2f\n", saldo);

                    break;
                case 2:
                    System.out.print("Digite o valor positivo que deseja depositar: ");
                    valorDepositar = scanner.nextDouble();
                    saldo += (valorDepositar > 0? valorDepositar : 0);

                    break;
                case 3:
                    if(saquesRestantes > 0){
                        System.out.print("Digite o valor que deseja sacar: ");
                        valorSaque = scanner.nextDouble();

                        if(valorSaque > saldo || valorSaque > 1000 || valorSaque <= 0){
                            System.out.println("O valor de saque máximo deve ser inferior ou igual a R$1000,00, menor que o saldo e maior que 0");
                        }
                        else{
                            saldo -= valorSaque;
                            saquesRestantes--;
                        }
                    }
                    else{
                        System.out.println("Limite de saques excedido, tente novamente amanhã");
                    }
            
                    break;
                default:
                    if(opcao != 0){
                        System.out.println("Opcão inválida");
                    }
            }
        } while (opcao != 0);
    }
}
