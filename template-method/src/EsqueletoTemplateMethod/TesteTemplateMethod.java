package EsqueletoTemplateMethod;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        mamifero.inicializar();
        System.out.println("Cachorro--------------------");
        Cachorro cachorro = new Cachorro();
        cachorro.inicializar();
    }

}
