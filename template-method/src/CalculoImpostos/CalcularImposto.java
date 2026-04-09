package CalculoImpostos;

public abstract class CalcularImposto {
    public void inicializar(){
        imprimirImposto();
    }
    public abstract double receberValorBase();
    public abstract double calcularImposto();
    public abstract void imprimirImposto();
}
