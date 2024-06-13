import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale[] locales = {
                new Locale("en", "US"),
                new Locale("fr", "FR"),
                new Locale("ja", "JP"),
                new Locale("es", "MX")
        };

        for (Locale locale : locales) {
            System.out.println("Locale: " + locale);
            System.out.println("Language: " + locale.getLanguage());
            System.out.println("Country: " + locale.getCountry());
            System.out.println();
        }
    }
}
