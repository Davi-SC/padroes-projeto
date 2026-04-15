public class TesteQ01 {
    public static void main(String[] args) {
        System.out.println("____________PDF_EXPORT____________");
        Exporter pdfExporter = new PDFExporter();
        pdfExporter.templateRelatorio();

        System.out.println("____________CSV_EXPORT____________");
        Exporter csvExporter = new CSVExporter();
        csvExporter.templateRelatorio();

        System.out.println("____________XML_EXPORT____________");
        Exporter xmlExporter = new XMLExporter();
        xmlExporter.templateRelatorio();
    }
}
