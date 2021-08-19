package com.company;

import com.company.console.Console;
import com.company.products.Produce;
import com.company.products.Meat;
import com.company.products.Product;
import com.company.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Store market=new Store(100);
        market.openForBusiness();



    }

    public static void test(){
        Console console=new Console();
        List<Product> products = new ArrayList<>();

        Product fillet = new Meat("Meat", 5, 20, "Fillet","Bison");
        Product steak = new Meat("Pork", 10,  10,"Center cut","Pork");
        Product breast = new Meat("Poultry", 5, 10,"breast", "Chicken");

        Product apple = new Produce("Fruit", 12, 5,"apple");
        Product orange = new Produce("Fruit", 12, 10,"orange");
        Product pear = new Produce("Fruit", 12, 20,"pear");

        products.add(steak);
        products.add(breast);
        products.add(fillet);

        products.add(apple);
        products.add(orange);
        products.add(pear);


        console.displayProduct(products);

        System.out.println();
        console.displayProduct(products, 2);

        System.out.println("\n\nInstance of Meat");
        console.displayProduct(products,"meat");

        System.out.println("\nInstance of Fruit");
        console.displayProduct(products,"fruit");

        console.cashier();
    }

}
