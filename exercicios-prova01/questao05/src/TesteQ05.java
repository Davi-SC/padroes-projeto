public class TesteQ05 {
    public static void main(String[] args) {
        ConfiguracaoSingleton config1 = ConfiguracaoSingleton.getInstance();
        ConfiguracaoSingleton config2 = ConfiguracaoSingleton.getInstance();

        System.out.println(config1);
        System.out.println(config2);
        System.out.println("São a mesma instancia? " + (config1 == config2));

    }
}
