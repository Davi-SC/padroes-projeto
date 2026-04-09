package documento;

public class Documento {
    private EstadoDocumento estado ;

    public Documento(){
        this.estado = new Rascunho();
    };

    public void setEstado(EstadoDocumento estado){
        this.estado = estado;
    };
    public EstadoDocumento getEstado(){
        return estado;
    };

    public void publicar(){
        estado.publicar(this);
    };
    public void negarRevisao(){
        estado.negarRevisao(this);
    };
    public void voltarRevisao(){
        estado.voltarRevisao(this);
    }
    public void comecarRevisao(){
        estado.comecarRevisao(this);
    }

    public void exibirEstadoAtual(){
        System.out.println("Estado atual do documento: "+estado.getNomeEstado());
    }
}
