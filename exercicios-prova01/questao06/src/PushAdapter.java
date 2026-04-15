public class PushAdapter implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificação por Push API");
    }
}
