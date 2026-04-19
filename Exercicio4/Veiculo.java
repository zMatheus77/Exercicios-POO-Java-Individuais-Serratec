import java.time.LocalDate;

public sealed abstract class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio{
    protected final String placa;
    protected final String marca;
    protected Double valorLocacaoDiaria;
    protected final Integer anoFabricacao;
    protected Double precoFipe;

    public Integer getAnoAtual(){
        return LocalDate.now().getYear();
    }

    Veiculo(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe){
        if(placa.length() <= 0){
            throw new NullPointerException("Placa não pode estar vazia");
        }
        if(marca.length() <= 0){
            throw new NullPointerException("Marca não pode estar vazia");
        }
        if(valorLocacaoDiaria <= 0){
            throw new IllegalArgumentException("Valor de locação deve ser positivo");
        }
        if(anoFabricacao > getAnoAtual()){
            throw new IllegalArgumentException("Ano de fabricação não pode ser superior ao ano atual");
        }
        if(precoFipe <= 0){
            throw new IllegalArgumentException("Preço tem que ser positivo");
        }

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }
}
