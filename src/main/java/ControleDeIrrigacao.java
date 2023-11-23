public class ControleDeIrrigacao implements IrrigacaoController{

    private SensorUmidadeSolo sensorUmidadeSolo;
    private SensorClima sensorClima;
    private SistemaDeIrrigacao sistemaDeIrrigacao;

    public ControleDeIrrigacao(){
        this.sensorUmidadeSolo = new SensorUmidadeSolo(this);
        this.sensorClima = new SensorClima(this);
        this.sistemaDeIrrigacao = new SistemaDeIrrigacao();
    }

    @Override
    public String  receberDadosUmidadeSolo(double umidadeSolo) {
        String str = "Umidade em conformidade.";
        if (umidadeSolo < 30.0){
            str = "Nível de Umidade Baixo. Iniciando Irrigação. ";
            str = str + sistemaDeIrrigacao.iniciarIrrigacao(50.0);
        }
        return str;
    }

    @Override
    public String receberDadosClima(String previsaoClima) {
        String str;
        if (previsaoClima.contains("chuva")){
            str = "Previsão de Chuva. Adiando irrigação.";
        } else {
            str = "Tempo seco. Monitorando umidade do solo.";
            //aqui ficaria monitorando a umidade do solo aguardando ficar abaixo do aceitável
        }
        return str;
    }

    public String iniciarSistemaIrrigacao() {
        return "Sistema de Controle de Irrigação iniciado.";
    }
}
