package main;

public class Celular extends Produto{
    int armazenamento;

    public Celular(float valor, int armazenamento) {
        super(valor);
        this.armazenamento = armazenamento;
    }

    @Override
    public float calcularValorTotal() {
        return (this.valorBase + (0.5f * this.armazenamento)) * (1 + this.imposto.percentualImposto());
    }
}
