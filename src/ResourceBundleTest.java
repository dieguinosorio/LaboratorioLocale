import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        Locale enLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");

        ResourceBundle bundleEN = ResourceBundle.getBundle("MessagesBundle", enLocale);
        System.out.println("English:");
        System.out.println("Greeting: " + bundleEN.getString("greeting"));
        System.out.println("Farewell: " + bundleEN.getString("farewell"));

        ResourceBundle bundleFR = ResourceBundle.getBundle("MessagesBundle", frLocale);
        System.out.println("French:");
        System.out.println("Greeting: " + bundleFR.getString("greeting"));
        System.out.println("Farewell: " + bundleFR.getString("farewell"));
    }
}
