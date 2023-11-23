public interface IrrigacaoController {

    String  receberDadosUmidadeSolo(double umidadeSolo);
    String receberDadosClima(String previsaoClima);
    String iniciarSistemaIrrigacao();
}
