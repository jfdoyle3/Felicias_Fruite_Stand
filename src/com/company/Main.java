package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
            // fix this and do assignment
        List<Product> products = new ArrayList<>();

        Product fillet = new Meat("Meat", 5, "fillet ", "Bison");
        Product steak = new Meat("Pork", 10, "center cut", "Pork");
        Product breast = new Meat("Poultry", 5, "breast", "Chicken");

        Product apple = new Fruit("Fruit", 12, "apple");
        Product orange = new Fruit("Fruit", 12, "orange");
        Product pear = new Fruit("Fruit", 12, "pear");

        products.add(steak);
        products.add(breast);
        products.add(fillet);

        products.add(apple);
        products.add(orange);
        products.add(pear);


        displayProduct(products);

        System.out.println();
        displayProduct(products, 2);

        System.out.println("\n\nInstance of Meat");
        displayProduct(products,"meat");

        System.out.println("\nInstance of Fruit");
        displayProduct(products,"fruit");



    }

    public static void displayProduct(List<Product> products) {
        System.out.println("List of Products:");
        for (Product product : products)
            System.out.println(product);
    }


    public static void displayProduct(List<Product> product, String type) {

        switch (type) {
            case "meat":
                for(Product item : product){
                    if (item instanceof Meat)
                        System.out.println(item);
                }
                break;
            case "fruit":
                for(Product item : product){
                    if(item instanceof Fruit)
                        System.out.println(item);
                }
                break;
            default:
                System.out.println("No such type");
        }
    }

    public static void displayProduct(List<Product> products, int index) {
        System.out.printf("\nProduct in list at index %d is:\n%s", index, products.get(index));
    }
}
