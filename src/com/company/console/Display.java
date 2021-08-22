package com.company.console;

import com.company.products.Meat;
import com.company.products.Produce;
import com.company.products.Product;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Display {

    public static String displayPrice(Long price) {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = n.format(price / 100.0);
        return s;
    }

    private static List<Product> supplierInventory() {
        List<Product> products = new ArrayList<>();

        Product fillet = new Meat("Beef", 5, 30, "fillet ", "Cow");
        Product steak = new Meat("Pork", 10, 20, "center cut", "Pork");
        Product breast = new Meat("Poultry", 5, 10, "breast", "Chicken");

        Product lettuce = new Produce("Vegetable", 12, 20, "lettuce");
        Product orange = new Produce("Fruit", 12, 50, "orange");
        Product potato = new Produce("Root Vegetable", 12, 20, "potato");

        products.add(steak);
        products.add(breast);
        products.add(fillet);

        products.add(lettuce);
        products.add(orange);
        products.add(potato);

        return products;
    }

}
