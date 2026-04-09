package documento;

public class Revisao implements EstadoDocumento {
    @Override
    public void comecarRevisao(Documento documento) {
        System.out.println("Revisao ja comecou");
    }

    @Override
    public void publicar(Documento documento) {
        System.out.println("Documento passou para publicacao");
        documento.setEstado(new Publicado());
    }

    @Override
    public void negarRevisao(Documento documento) {
        System.out.println("Documento negado");
        documento.setEstado(new Negado());
    }

    @Override
    public void voltarRevisao(Documento documento) {
        System.out.println("Documento voltou para edicao");
        documento.setEstado(new Rascunho());
    }

    @Override
    public String getNomeEstado(){
        return "Revisao";
    }
}
