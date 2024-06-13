public class ReadPropertiesFromCommandLineTest {
    public static void main(String[] args) {
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
