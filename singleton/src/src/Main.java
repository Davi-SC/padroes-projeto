public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        System.out.println("São as duas a mesma instancia? " + (connection1 == connection2));
    }
}
