public class Reproduzindo implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Ja esta reproduzindo");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Pausando video");
        player.setEstado(new Pausado());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Parando video");
        player.setEstado(new Parado());
    }
}
