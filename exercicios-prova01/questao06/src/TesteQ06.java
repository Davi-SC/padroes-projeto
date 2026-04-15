public class TesteQ06 {
    public static void main(String[] args) {
        SistemaNotificacao sistema = new SistemaNotificacao();
        System.out.println("Testando Sistema de notificacao");
        sistema.setNotificador(new EmailAdapter());
        sistema.enviarNotificacao();
        sistema.setNotificador(new SmsAdapter());
        sistema.enviarNotificacao();
        sistema.setNotificador(new PushAdapter());
        sistema.enviarNotificacao();

    }
}
