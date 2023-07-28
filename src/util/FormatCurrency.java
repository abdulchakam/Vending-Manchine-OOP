package util;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {

    public static String RupiahCurrencyFormat(long nominal) {
        String nominalRupiah = "";

        Locale locale = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);

        nominalRupiah = rupiahFormat.format(nominal);
        return nominalRupiah;
    }
}
