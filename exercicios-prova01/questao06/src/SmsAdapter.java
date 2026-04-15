public class SmsAdapter implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificação por SMS");
    }

}
