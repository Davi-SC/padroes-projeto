public class TesteQ02 {
    public static void main(String[] args) {
        CalculadoraValor calculadora = new CalculadoraValor();
        System.out.println("Calculadora de valor");
        Double valor = 100.0;

        calculadora.setStrategy(new DescontoPercentual());
        System.out.println("Aplicando Desconto Percentual");
        calculadora.calculaValor(valor);
    }
}
