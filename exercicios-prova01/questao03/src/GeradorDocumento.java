public abstract class GeradorDocumento {

    public void gerarDocumento(){
        buscarDados();
        montarCabecalho();
        gerarCorpoDocumento();
        assinarDigitalmente();
        disponibilizarDownload();
    }

    public void buscarDados(){
        System.out.println("Buscando dados");
    }

    public void montarCabecalho(){
        System.out.println("Montando cabecalho");
    }

    public abstract void gerarCorpoDocumento();

    public void assinarDigitalmente(){
        System.out.println("Documento Assinado");
    }

    public void disponibilizarDownload(){
        System.out.println("Download disponivel");
    }
}
