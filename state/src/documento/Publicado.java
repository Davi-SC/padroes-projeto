package documento;

public class Publicado implements EstadoDocumento {
    @Override
    public void comecarRevisao(Documento documento) {
        System.out.println("Documento ja foi publicado");
    }

    @Override
    public void publicar(Documento documento) {
        System.out.println("Documento ja foi publicado");
    }

    @Override
    public void negarRevisao(Documento documento) {
        System.out.println("Documento ja foi publicado");
    }

    @Override
    public void voltarRevisao(Documento documento) {
        System.out.println("Documento ja foi publicado");
    }

    @Override
    public String getNomeEstado(){
        return "Publicado";
    }
}
