public class Parado implements PlayerState {

    @Override
    public void play(Player player) {
        System.out.println("Começando video do inicio");
        player.setEstado(new Reproduzindo());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Não pode pausar um video parado");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Video ja parado");
    }
}
