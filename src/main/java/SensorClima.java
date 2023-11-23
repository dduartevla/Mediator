public class SensorClima {

    private IrrigacaoController mediador;

    public SensorClima(IrrigacaoController mediador){
        this.mediador = mediador;
    }

    public void lerDadosClima(String dadosClima){
        mediador.receberDadosClima(dadosClima);
    }
}
