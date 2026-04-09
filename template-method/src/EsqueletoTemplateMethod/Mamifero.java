package EsqueletoTemplateMethod;

public class Mamifero extends SerVivo{

    @Override
    public void nasce() {
        System.out.println("Nasceu de parto");
    }

    @Override
    public void cresce() {
        System.out.println("Crescendo");
    }

    @Override
    public void reproduz() {
        System.out.println("Sexo bixo kkkkkk");
    }

    @Override
    public void morre() {
        System.out.println("Press F to pray respect");
    }
}
