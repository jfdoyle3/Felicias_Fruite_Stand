package com.company.console;

import java.text.NumberFormat;
import java.util.Locale;

public class Display {

    public static String displayPrice(Long price) {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = n.format(price / 100.0);
        return s;
    }
}
