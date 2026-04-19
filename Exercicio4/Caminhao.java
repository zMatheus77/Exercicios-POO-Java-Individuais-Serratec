final class Caminhao extends Veiculo{
    private Double capacidadeCargaToneladas;

    Caminhao(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe, Double capacidadeCargaToneladas){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if(capacidadeCargaToneladas <= 0){
            throw new IllegalArgumentException("Capacidade de carga deve ser positiva");
        }

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    public Double alugarVeiculo(Double pesoCargaToneladas, Integer dias){
        if(dias <= 0){
            throw new IllegalArgumentException("Quantidade de dias tem que ser positivo");
        }

        if(pesoCargaToneladas <= 0){
            throw new IllegalArgumentException("O peso da carga deve ser positivo");
        }

        if(pesoCargaToneladas > capacidadeCargaToneladas){
            valorLocacaoDiaria *= 1.10;
        }
        
        return valorLocacaoDiaria * dias;
    }

    public Double calcularIpva(){
        if(getAnoAtual() - anoFabricacao > 20){
            return 0.0;
        }
        else{
             return precoFipe * 0.015;
        }
    }
}
