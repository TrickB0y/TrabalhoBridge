package main;

public abstract class Produto {

    protected Imposto imposto;
    protected float valorBase;

    public Produto(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setImposto (Imposto imposto) {
        this.imposto = imposto;
    }

    public void setValorBase (float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValorTotal();
}
