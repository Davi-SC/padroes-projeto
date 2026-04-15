public class Pausado implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Retomando video");
        player.setEstado(new Reproduzindo());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Video ja esta pausado");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Parando video");
        player.setEstado(new Parado());
    }
}
