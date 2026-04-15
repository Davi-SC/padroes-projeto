public class TesteQ01 {
    public static void main(String[] args) {
        ReportExporter exportador = new ReportExporter();
        System.out.println("Gerador de Relatorio");

        System.out.println("Gerando relatorio em PDF");
        exportador.setStrategy(new PDFExportStrategy());
        exportador.gerarRelatorio();

        System.out.println("Gerando relatorio em XML");
        exportador.setStrategy(new XMLExportStrategy());
        exportador.gerarRelatorio();

        System.out.println("Gerando relatorio em CSV");
        exportador.setStrategy(new CSVExportStrategy());
        exportador.gerarRelatorio();

    }
}
