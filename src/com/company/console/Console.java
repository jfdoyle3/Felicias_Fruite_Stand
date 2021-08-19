package com.company.console;

import com.company.products.Meat;
import com.company.products.Produce;
import com.company.products.Product;

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

    private static Scanner input=new Scanner(System.in);

    public static void cashier(){
        while(true) {
            System.out.println("Options:\n1. Show Inventory\n2. Add to inventory\n3. Trash bad inventory\n4. Cash Register");
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                   // displayProduct();
                    break;
                case 2:
                    System.out.println("add to inventory");
                    break;
                case 3:
                    System.out.println("remove from inventory");
                    break;
                case 4:
                    System.out.println("cash register");
                    break;
                default:
                    System.out.println("invalid selection - try again");
            }
            System.out.println("continue on ....");
        }
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
                    if(item instanceof Produce)
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
