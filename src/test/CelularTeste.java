package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelularTeste {

    @Test
    void deveRetornarValorTotalComImpostoTexas() {
        Imposto imposto = new VendasTexas();
        Produto produto = new Celular(1000.0f, 10);
        produto.setImposto(imposto);
        assertEquals(1085.4f, produto.calcularValorTotal(), 0.01f);
    }

    @Test
    void deveRetornarValorTotalComImpostoBrasil() {
        Imposto imposto = new CelularBrasil();
        Produto produto = new Celular(1000.0f, 10);
        produto.setImposto(imposto);
        assertEquals(1608f, produto.calcularValorTotal(), 0.01f);
    }
}
