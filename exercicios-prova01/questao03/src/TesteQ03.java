public class TesteQ03 {
    public static void main(String[] args) {
        System.out.println("Teste da Questao 3 - Gerador de documento com o Template Method");
        GeradorDocumento gerador = new Declaracao();
        gerador.gerarDocumento();
        System.out.println();
        gerador = new Certificado();
        gerador.gerarDocumento();
        System.out.println();
        gerador = new Historico();
        gerador.gerarDocumento();
    }
}
