package com.company.store;

import com.company.console.Console;
import com.company.products.Meat;
import com.company.products.Product;

import java.util.HashMap;

public class Store {

    private int storeBalance;
    private HashMap<String, Product> warehouse;
    private HashMap<Product, Integer> availableGoods;

    public Store() {
        this.availableGoods = new HashMap<Product, Integer>();
        this.warehouse = new HashMap<String, Product>();
    }

    public void openForBusiness() {
        storeBalance = 100000;
        Console console=new Console();
        System.out.println("We're open come on in!!");
        String item = "Meat";
        Product meat = new Meat("Meat", 5, 10, "fillet ", "Bison");
      //  buyFromSupplier(item, meat);
       // addToStore(item, 10);
        // console.onDisplayOptions(this,item,meat);
        console.warehouseOptions(this);


    }



    public void basicStore() {
        storeBalance = 100000;
        System.out.println();
        System.out.println("Logic: Store operations:");
        String item = "Meat";
        Product meat = new Meat("Meat", 5, 10, "fillet ", "Bison");
        System.out.println("Store: " + this);
        buyFromSupplier(item, meat);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Store bought from supplier: " + this);
        addToStore(item, 10);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Put Item on Display: " + this);
        buyFromStore(meat, 3);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Buy Item: " + this);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Store: " + this);
    }

    private void addToStore(String item, int price) {
        availableGoods.put(warehouse.get(item), price);
        warehouse.remove(item);
    }

    public void removeFromWarehouse(String item) {
        warehouse.remove(item);
    }

    private void removeFromStore(Product product) {
        availableGoods.remove(product);
    }

    public void buyFromSupplier(String item, Product product) {
        storeBalance -= product.getSupplierCost() * product.getInventoryAmount();
        warehouse.put(item, product);
    }

    public void buyFromStore(Product product, int qty) {
        if (qty < product.getInventoryAmount()) {
            storeBalance += qty * availableGoods.get(product);
            int updateInv = Math.abs(product.getInventoryAmount() - qty);
            product.updateInventory(updateInv);
        } else {
            storeBalance += product.getInventoryAmount() * availableGoods.get(product);
            availableGoods.remove(product);
        }
    }


    @Override
    public String toString() {
        return "Store{" +
                "storeBalance=" + storeBalance +
                ", warehouse=" + warehouse +
                ", availableGoods=" + availableGoods +
                '}';
    }
}
