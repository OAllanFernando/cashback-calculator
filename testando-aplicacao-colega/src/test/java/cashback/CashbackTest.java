package cashback;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import paranavai.ifpr.edu.br.GrauFidelidadeEnum;
import paranavai.ifpr.edu.br.SimuladorCashback;

public class CashbackTest {

    @Test
    public void testaCashBackLimiteInferiorParticaoABronze() {
        Double descontoLimiteInferiorParticaoABronze = SimuladorCashback.calcularCashback(-0.01,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteInferiorParticaoABronzeEsperado = 0.0;
        assertEquals(descontoLimiteInferiorParticaoABronzeEsperado, descontoLimiteInferiorParticaoABronze, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoAPrata() {
        Double descontoLimiteInferiorParticaoAPrata = SimuladorCashback.calcularCashback(-0.01,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteInferiorParticaoAPrataEsperado = 0.0;
        assertEquals(descontoLimiteInferiorParticaoAPrataEsperado, descontoLimiteInferiorParticaoAPrata, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoAOuro() {
        Double descontoLimiteInferiorParticaoAOuro = SimuladorCashback.calcularCashback(-0.01,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteInferiorParticaoAOuroEsperado = 0.0;
        assertEquals(descontoLimiteInferiorParticaoAOuroEsperado, descontoLimiteInferiorParticaoAOuro, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoABronze() {
        Double descontoLimiteSuperiorParticaoABronze = SimuladorCashback.calcularCashback(0.01,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteSuperiorParticaoABronzeEsperado = 0.0005;
        assertEquals(descontoLimiteSuperiorParticaoABronzeEsperado, descontoLimiteSuperiorParticaoABronze, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoAPrata() {
        Double descontoLimiteSuperiorParticaoAPrata = SimuladorCashback.calcularCashback(0.01,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteSuperiorParticaoAPrataEsperado = 0.001;
        assertEquals(descontoLimiteSuperiorParticaoAPrataEsperado, descontoLimiteSuperiorParticaoAPrata, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoAOuro() {
        Double descontoLimiteSuperiorParticaoAOuro = SimuladorCashback.calcularCashback(0.01,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteSuperiorParticaoAOuroEsperado = 0.0015;
        assertEquals(descontoLimiteSuperiorParticaoAOuroEsperado, descontoLimiteSuperiorParticaoAOuro, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBBronze() {
        Double descontoLimiteInferiorParticaoBBronze = SimuladorCashback.calcularCashback(99.99,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteInferiorParticaoBBronzeEsperado = 4.9995;
        assertEquals(descontoLimiteInferiorParticaoBBronzeEsperado, descontoLimiteInferiorParticaoBBronze, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBPrata() {
        Double descontoLimiteInferiorParticaoBPrata = SimuladorCashback.calcularCashback(99.99,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteInferiorParticaoBPrataEsperado = 9.999;
        assertEquals(descontoLimiteInferiorParticaoBPrataEsperado, descontoLimiteInferiorParticaoBPrata, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBOuro() {
        Double descontoLimiteInferiorParticaoBOuro = SimuladorCashback.calcularCashback(99.99,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteInferiorParticaoBOuroEsperado = 14.9985;
        assertEquals(descontoLimiteInferiorParticaoBOuroEsperado, descontoLimiteInferiorParticaoBOuro, 0.00);
    }

    // Limite Superior Partição B - valor 100.01
    @Test
    public void testaCashBackLimiteSuperiorParticaoBBronze() {
        Double descontoLimiteSuperiorParticaoBBronze = SimuladorCashback.calcularCashback(100.01,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteSuperiorParticaoBBronzeEsperado = 5.0005;
        assertEquals(descontoLimiteSuperiorParticaoBBronzeEsperado, descontoLimiteSuperiorParticaoBBronze, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoBPrata() {
        Double descontoLimiteSuperiorParticaoBPrata = SimuladorCashback.calcularCashback(100.01,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteSuperiorParticaoBPrataEsperado = 10.001;
        assertEquals(descontoLimiteSuperiorParticaoBPrataEsperado, descontoLimiteSuperiorParticaoBPrata, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoBOuro() {
        Double descontoLimiteSuperiorParticaoBOuro = SimuladorCashback.calcularCashback(100.01,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteSuperiorParticaoBOuroEsperado = 15.0015;
        assertEquals(descontoLimiteSuperiorParticaoBOuroEsperado, descontoLimiteSuperiorParticaoBOuro, 0.00);
    }

    // Limite Inferior Partição C - valor 100.00
    @Test
    public void testaCashBackLimiteInferiorParticaoCBronze() {
        Double descontoLimiteInferiorParticaoCBronze = SimuladorCashback.calcularCashback(100.00,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteInferiorParticaoCBronzeEsperado = 5.0;
        assertEquals(descontoLimiteInferiorParticaoCBronzeEsperado, descontoLimiteInferiorParticaoCBronze, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoCPrata() {
        Double descontoLimiteInferiorParticaoCPrata = SimuladorCashback.calcularCashback(100.00,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteInferiorParticaoCPrataEsperado = 10.0;
        assertEquals(descontoLimiteInferiorParticaoCPrataEsperado, descontoLimiteInferiorParticaoCPrata, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoCOuro() {
        Double descontoLimiteInferiorParticaoCOuro = SimuladorCashback.calcularCashback(100.00,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteInferiorParticaoCOuroEsperado = 15.0;
        assertEquals(descontoLimiteInferiorParticaoCOuroEsperado, descontoLimiteInferiorParticaoCOuro, 0.00);
    }

    // Limite Superior Partição C - valor 100.02
    @Test
    public void testaCashBackLimiteSuperiorParticaoCBronze() {
        Double descontoLimiteSuperiorParticaoCBronze = SimuladorCashback.calcularCashback(100.02,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteSuperiorParticaoCBronzeEsperado = 5.001;
        assertEquals(descontoLimiteSuperiorParticaoCBronzeEsperado, descontoLimiteSuperiorParticaoCBronze, 0.00000);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoCPrata() {
        Double descontoLimiteSuperiorParticaoCPrata = SimuladorCashback.calcularCashback(100.02,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteSuperiorParticaoCPrataEsperado = 10.002;
        assertEquals(descontoLimiteSuperiorParticaoCPrataEsperado, descontoLimiteSuperiorParticaoCPrata, 0.00000);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoCOuro() {
        Double descontoLimiteSuperiorParticaoCOuro = SimuladorCashback.calcularCashback(100.02,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteSuperiorParticaoCOuroEsperado = 15.003;
        assertEquals(descontoLimiteSuperiorParticaoCOuroEsperado, descontoLimiteSuperiorParticaoCOuro, 0.00000);
    }

    // Limite Inferior Partição D - valor 499.99
    @Test
    public void testaCashBackLimiteInferiorParticaoDBronze() {
        Double descontoLimiteInferiorParticaoDBronze = SimuladorCashback.calcularCashback(499.99,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteInferiorParticaoDBronzeEsperado = 24.9995;
        assertEquals(descontoLimiteInferiorParticaoDBronzeEsperado, descontoLimiteInferiorParticaoDBronze, 0.00000);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoDPrata() {
        Double descontoLimiteInferiorParticaoDPrata = SimuladorCashback.calcularCashback(499.99,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteInferiorParticaoDPrataEsperado = 49.999;
        assertEquals(descontoLimiteInferiorParticaoDPrataEsperado, descontoLimiteInferiorParticaoDPrata, 0.00000);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoDOuro() {
        Double descontoLimiteInferiorParticaoDOuro = SimuladorCashback.calcularCashback(499.99,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteInferiorParticaoDOuroEsperado = 74.9985;
        assertEquals(descontoLimiteInferiorParticaoDOuroEsperado, descontoLimiteInferiorParticaoDOuro, 0.00000);
    }

    // Limite Superior Partição D - valor 500.01
    @Test
    public void testaCashBackLimiteSuperiorParticaoDBronze() {
        Double descontoLimiteSuperiorParticaoDBronze = SimuladorCashback.calcularCashback(500.01,
                GrauFidelidadeEnum.BRONZE);
        Double descontoLimiteSuperiorParticaoDBronzeEsperado = 25.0005;
        assertEquals(descontoLimiteSuperiorParticaoDBronzeEsperado, descontoLimiteSuperiorParticaoDBronze, 0.00000);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoDPrata() {
        Double descontoLimiteSuperiorParticaoDPrata = SimuladorCashback.calcularCashback(500.01,
                GrauFidelidadeEnum.PRATA);
        Double descontoLimiteSuperiorParticaoDPrataEsperado = 50.001;
        assertEquals(descontoLimiteSuperiorParticaoDPrataEsperado, descontoLimiteSuperiorParticaoDPrata, 0.00000);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoDOuro() {
        Double descontoLimiteSuperiorParticaoDOuro = SimuladorCashback.calcularCashback(500.01,
                GrauFidelidadeEnum.OURO);
        Double descontoLimiteSuperiorParticaoDOuroEsperado = 75.0015;
        assertEquals(descontoLimiteSuperiorParticaoDOuroEsperado, descontoLimiteSuperiorParticaoDOuro, 0.00000);
    }
}
