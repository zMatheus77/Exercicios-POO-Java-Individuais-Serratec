import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0, saquesRestantes = 3;
        ContaBancaria conta = new ContaBancaria(1, "Matheus");

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
                    System.out.printf("Seu saldo é de R$%.2f", conta.getSaldo());

                    break;
                case 2:
                    System.out.print("Digite o valor positivo que deseja depositar: ");
                    conta.depositar(scanner.nextDouble());

                    break;
                case 3:
                    if(saquesRestantes > 0){
                        System.out.print("Digite o valor que deseja sacar: ");
                        if(conta.sacar(scanner.nextDouble())){
                            saquesRestantes--;
                        }

                        break;
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
        }while(opcao != 0);

    }
}
