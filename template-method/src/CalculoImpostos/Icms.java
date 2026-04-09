package CalculoImpostos;
import java.util.Scanner;

public class Icms extends CalcularImposto{
    Scanner sc = new Scanner(System.in);

    @Override
    public double receberValorBase() {
        System.out.println("Digite o Valor de Mercado do produto:");
        return sc.nextDouble();
    }

    @Override
    public double calcularImposto() {
        double vb = receberValorBase();
        // ValorBase x (aliquota / 100)
        // aliquota do icms no maranhão é 23%
        return vb*(23.0/100.0);
    }

    @Override
    public void imprimirImposto() {
        double imposto = calcularImposto();
        System.out.println("Valor do ICMS no MA: "+ imposto);
    }
}
