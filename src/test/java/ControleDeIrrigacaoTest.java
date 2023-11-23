import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleDeIrrigacaoTest {

    @Test
    void deveIniciarSistemaDeIrrigacao(){
        ControleDeIrrigacao controle = new ControleDeIrrigacao();
        String resultado = controle.iniciarSistemaIrrigacao();
        assertEquals("Sistema de Controle de Irrigação iniciado.", resultado);
    }

    @Test
    void deveReceberDadosUmidadeSoloBaixo(){
        ControleDeIrrigacao controle = new ControleDeIrrigacao();
        String resultado = controle.receberDadosUmidadeSolo(25.0);
        assertEquals("Nível de Umidade Baixo. Iniciando Irrigação. Irrigando: 50.0mm de água. ", resultado);
    }

    @Test
    void deveReceberDadosUmidadeSoloConforme(){
        ControleDeIrrigacao controle = new ControleDeIrrigacao();
        String resultado = controle.receberDadosUmidadeSolo(45.0);
        assertEquals("Umidade em conformidade.", resultado);
    }

    @Test
    void deveReceberDadosClimaChuva(){
        ControleDeIrrigacao controle = new ControleDeIrrigacao();
        String resultado = controle.receberDadosClima("chuva");
        assertEquals("Previsão de Chuva. Adiando irrigação.", resultado);
    }

    @Test
    void deveReceberDadosClimaNaoChuva(){
        ControleDeIrrigacao controle = new ControleDeIrrigacao();
        String resultado = controle.receberDadosClima("sol");
        assertEquals("Tempo seco. Monitorando umidade do solo.", resultado);
    }

}