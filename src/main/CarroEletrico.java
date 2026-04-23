package main;

public class CarroEletrico extends Produto {
    public CarroEletrico(Float valor) {
        super(valor);
    }

    @Override
    public float calcularValorTotal() {
        return this.valorBase * (1.0f + this.imposto.percentualImposto());
    }
}
