public class CalculadoraValor {
    private PromocionalStrategy politicaStrategy;

    public void setStrategy(PromocionalStrategy politica) {
        this.politicaStrategy = politica;
    }

    public void calculaValor(Double valorBase){
        System.out.println("Valor base: "+ valorBase);
        Double valorFinal = politicaStrategy.aplicar(valorBase);
        System.out.println("Valor final: " + valorFinal);
    }
}
