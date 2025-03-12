import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        String Idioma = locale.getDisplayLanguage();
        String Pais = locale.getDisplayCountry();

        System.out.println("O idioma do Sistema é:" + Idioma);
        System.out.println("O País do Sistema é:" + Pais);

    }
}
