package main;

public class SacoDeBatatas extends Produto {
    public SacoDeBatatas(float valor) {
        super(valor);
    }

    @Override
    public float calcularValorTotal() {
        return this.valorBase * (1.0f + this.imposto.percentualImposto());
    }
}
