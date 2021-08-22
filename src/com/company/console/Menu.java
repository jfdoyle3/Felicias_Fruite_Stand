package com.company.console;

import java.util.Scanner;

public class Menu {

    private static Scanner input = new Scanner(System.in);

    public static void storeMenu() {
        boolean exit = true;
        while (exit) {
            System.out.println("Manager Store\n1. Warehouse manager\n2. Store manager\n3. Quit");
            System.out.print("\nChoice? ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    // warehouseOptions(store);
                    System.out.println("warehouse");
                    break;
                case 2:
                    // onDisplayOptions(store, product);
                    System.out.println("sales floor");
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("invalid choice");
            }

        }

    }
}
