import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LeerPropiedades {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("appName: " + properties.getProperty("appName"));
        System.out.println("version: " + properties.getProperty("version"));
        System.out.println("author: " + properties.getProperty("author"));
    }
}
