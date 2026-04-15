public abstract class Exporter {
    public void templateRelatorio(){
        System.out.println("Preparando relatorio...");
        buscarDados();
        gerarArquivo();
        limparDados();
        exportarRelatorio();
    }
    public void buscarDados(){
        System.out.println("Buscando dados...");
    }
    public void limparDados(){
        System.out.println("Limpando dados...");
    }
    public abstract void gerarArquivo();

    public void exportarRelatorio(){
        System.out.println("Relatorio pronto... Exportando...");
    }
}
