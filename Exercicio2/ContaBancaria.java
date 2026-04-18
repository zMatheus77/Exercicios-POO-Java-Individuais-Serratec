public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;
    private String titular;

    ContaBancaria(Integer numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.saldo = 50.0;
        this.titular = titular;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void depositar(Double valorDepositar){
         if(valorDepositar > 0){
            this.saldo += valorDepositar;
            return;
         }

         System.out.println("O valor de depósito tem que ser positivo");
    }

    public boolean sacar(Double valorSaque){
        if(valorSaque > 0 && valorSaque < this.saldo && valorSaque <= 1000){
            this.saldo -= valorSaque;
            return true;
        }

        System.out.println("O valor de saque deve ser superior a 0, inferior ou igual a 1000 e inferior ao saldo");
        return false;
    }
}
