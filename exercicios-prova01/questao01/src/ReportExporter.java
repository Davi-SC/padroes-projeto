public class ReportExporter {
    private ExportStrategy strategy;

    public void setStrategy(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public void gerarRelatorio() {
        strategy.exportar();
    }

}
