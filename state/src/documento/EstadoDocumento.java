package documento;

public interface EstadoDocumento {
    public void comecarRevisao(Documento documento); // Rascunho --> Revisao
    public void publicar(Documento documento); // Revisao --> Publicar
    public void negarRevisao(Documento documento); // Revisao --> Negado
    public void voltarRevisao(Documento documento); // Revisao --> Rascunho
    String getNomeEstado();
}
