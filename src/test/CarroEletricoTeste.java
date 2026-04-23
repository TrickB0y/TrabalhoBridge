package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroEletricoTeste {

    @Test
    void deveRetornarValorTotalComImpostoTexas() {
        Imposto imposto = new VeiculoMotorizadoTexas();
        Produto produto = new CarroEletrico(1000.0f);
        produto.setImposto(imposto);
        assertEquals(1060f, produto.calcularValorTotal(), 0.01f);
    }

    @Test
    void deveRetornarValorTotalComImpostoBrasil() {
        Imposto imposto = new VeiculoMotorizadoBrasil();
        Produto produto = new CarroEletrico(1000.0f);
        produto.setImposto(imposto);
        assertEquals(1300f, produto.calcularValorTotal(), 0.01f);
    }
}
