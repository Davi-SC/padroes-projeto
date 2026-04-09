package documento;

public class Negado implements EstadoDocumento {
    @Override
    public void comecarRevisao(Documento documento) {
        System.out.println("Documento ja foi negado");
    }

    @Override
    public void publicar(Documento documento) {
        System.out.println("Documento ja foi negado");
    }

    @Override
    public void negarRevisao(Documento documento) {
        System.out.println("Documento ja foi negado");
    }

    @Override
    public void voltarRevisao(Documento documento) {
        System.out.println("Documento ja foi negado");
    }

    @Override
    public String getNomeEstado(){
        return "Negado";
    }
}
