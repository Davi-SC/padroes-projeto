package documento;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();

        documento.exibirEstadoAtual();

        documento.comecarRevisao();
        documento.exibirEstadoAtual();

        documento.publicar();
        documento.exibirEstadoAtual();

        documento.negarRevisao();
    }
}
