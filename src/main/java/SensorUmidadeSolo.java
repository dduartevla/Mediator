public class SensorUmidadeSolo {

    private IrrigacaoController mediador;

    public SensorUmidadeSolo(IrrigacaoController mediador){
        this.mediador = mediador;
    }

    public void lerNivelUmidade(double umidade){
        mediador.receberDadosUmidadeSolo(umidade);
    }
}
