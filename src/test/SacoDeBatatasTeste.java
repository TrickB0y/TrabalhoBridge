package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SacoDeBatatasTeste {

    @Test
    void deveRetornarValorTotalComImpostoTexas() {
        Imposto imposto = new AlimentoNaoPreparadoTexas();
        Produto produto = new SacoDeBatatas(10.0f);
        produto.setImposto(imposto);
        assertEquals(10.0f, produto.calcularValorTotal(), 0.01f);
    }

    @Test
    void deveRetornarValorTotalComImpostoBrasil() {
        Imposto imposto = new HortifrutiBrasil();
        Produto produto = new SacoDeBatatas(10.0f);
        produto.setImposto(imposto);
        assertEquals(11.2f, produto.calcularValorTotal(), 0.01f);
    }
}
