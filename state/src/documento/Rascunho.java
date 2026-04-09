package documento;

public class Rascunho implements EstadoDocumento {
    @Override
    public void comecarRevisao(Documento documento) {
        System.out.println("Rascunho passou para revisão");
        documento.setEstado(new Revisao());
    }

    @Override
    public void publicar(Documento documento) {
        System.out.println("Nao é possivel publicar, nao foi revisado");
    }

    @Override
    public void negarRevisao(Documento documento) {
        System.out.println("Nao é possivel negar, nao foi revisado");
    }

    @Override
    public void voltarRevisao(Documento documento) {
        System.out.println("Nao é possivel voltar para edição, nao foi revisado");
    }

    @Override
    public String getNomeEstado(){
        return "Rascunho";
    }
}
