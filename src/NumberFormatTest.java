import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        double number = 12345.67;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat jpFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        System.out.println("US: " + usFormat.format(number));
        System.out.println("France: " + frFormat.format(number));
        System.out.println("Japan: " + jpFormat.format(number));
    }
}
