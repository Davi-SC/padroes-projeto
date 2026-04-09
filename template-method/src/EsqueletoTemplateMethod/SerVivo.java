package EsqueletoTemplateMethod;

public abstract class SerVivo {
    public void inicializar(){
        nasce();
        cresce();
        reproduz();
        morre();
    }
    public abstract void nasce();
    public abstract void cresce();
    public abstract void reproduz();
    public abstract void morre();

}
