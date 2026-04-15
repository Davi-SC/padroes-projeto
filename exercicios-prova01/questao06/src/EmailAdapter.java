public class EmailAdapter implements Notificador{
    @Override
    public void notificar() {
        System.out.println("Enviando notificação por email");
    }
}
