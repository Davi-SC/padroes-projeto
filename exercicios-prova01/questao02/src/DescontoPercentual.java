public class DescontoPercentual implements PromocionalStrategy{
    private Double percentual = 5.0;

    @Override
    public Double aplicar(Double valorBase){
        System.out.println("Valor do desconto de percentual("+percentual+"%): "+(valorBase*percentual/100));
        return valorBase-(valorBase*percentual/100);
    }
}
