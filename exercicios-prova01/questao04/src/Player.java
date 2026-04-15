public class Player {
    private PlayerState estado;

    public Player() {
        this.estado = new Parado();
    }

    public void setEstado(PlayerState estado) {
        this.estado = estado;
    }

    public void play() {
        estado.play(this);
    }

    public void pause() {
        estado.pause(this);
    }

    public void stop() {
        estado.stop(this);
    }

}
