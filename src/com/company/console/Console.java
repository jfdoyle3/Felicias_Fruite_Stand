package com.company.console;

import com.company.products.Meat;
import com.company.products.Produce;
import com.company.products.Product;
import com.company.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    runs a user interface for the cashier.
    is given options to:
    add products to the store.
    throw away bad products
    sell products to a client.
 */
public class Console {

    private static Scanner input = new Scanner(System.in);

    public static void warehouseOptions(Store store) {
        System.out.println("Options:\n1. Show Inventory\n2. Buy from Supplier\n3. Trash bad inventory\n4. Add to Display");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.println(store.toString());
                break;
            case 2: {
                supplierTransaction(store);
                break;
            }
            case 3:
                System.out.println("remove from inventory");
               // store.removeFromWarehouse();
                break;
            case 4:
                System.out.println("Add to Display");
                break;
            default:
                System.out.println("invalid selection - try again");

                System.out.println("continue on ....");
        }
    }

    private static void supplierTransaction(Store store) {
        List<Product> inventory=supplierInventory();
        System.out.println("meat\nproduce");
        String choice=input.next();
        displayProduct(inventory,choice);
        int item=input.nextInt();
        store.buyFromSupplier(choice,inventory.get(item));
        System.out.println(store.toString());
    }

    public static void onDisplayOptions(Store store, String item, Product product) {
        while (true) {
            System.out.println("Options:\n1. Show Goods\n2. Cash Register");
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println(store.toString());
                    break;
                case 2: {
                    System.out.println("How many? qty: " + product.getInventoryAmount());
                    int qty = input.nextInt();
                    store.buyFromStore(product, qty);
                    break;
                }

                default:
                    System.out.println("invalid selection - try again");
            }
            System.out.println("continue on ....");
        }
    }

    private static List<Product> supplierInventory() {
        List<Product> products = new ArrayList<>();

        Product fillet = new Meat("Meat", 5, 30, "fillet ", "Cow");
        Product steak = new Meat("Pork", 10, 20, "center cut", "Pork");
        Product breast = new Meat("Poultry", 5, 10, "breast", "Chicken");

        Product lettuce = new Produce("Vegetable", 12, 20, "lettuce");
        Product orange = new Produce("Fruit", 12, 50, "orange");
        Product potato = new Produce("Vegetable", 12, 20, "potato");

        products.add(steak);
        products.add(breast);
        products.add(fillet);

        products.add(lettuce);
        products.add(orange);
        products.add(potato);

        return products;
    }

    private static void displayProduct(List<Product> product, String type) {

        switch (type) {
            case "meat":
                for (int idx=0; idx<product.size(); idx++){
                    if (product.get(idx) instanceof Meat)
                        System.out.println(idx+": "+product.get(idx));
                }
                break;
            case "produce":
                for (int idx=0; idx<product.size(); idx++){
                    if (product.get(idx) instanceof Produce)
                        System.out.println(idx+": "+product.get(idx));
                }
                break;
            default:
                System.out.println("No such type");
        }
    }

    private static void displayProduct(List<Product> products) {
        System.out.println("List of Products:");
        for (Product product : products)
            System.out.println(product);
    }


}
