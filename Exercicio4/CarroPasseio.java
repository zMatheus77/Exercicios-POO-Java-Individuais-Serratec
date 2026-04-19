final class CarroPasseio extends Veiculo {
    CarroPasseio(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    public Double calcularIpva(){
        if(getAnoAtual() - anoFabricacao > 20){
            return 0.0;
        }
        else{
             return precoFipe * 0.04;
        }
    }

    public Double alugarVeiculo(Double pesoCarga, Integer dias){
        if(dias <= 0){
            throw new IllegalArgumentException("Quantidade de dias tem que ser positivo");
        }

        return valorLocacaoDiaria * dias;
    }
}
