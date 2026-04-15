public class SistemaNotificacao {
    private Notificador notificador;

    public void enviarNotificacao(){
        notificador.notificar();
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
