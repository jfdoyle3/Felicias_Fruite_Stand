package com.company.store;

import com.company.products.Meat;
import com.company.products.Product;

import java.util.HashMap;

public class Store {

    private int storeBalance;
    private HashMap<String, Product> warehouse;
    private HashMap<Product, Integer> availableGoods;

    public Store(int storeBalance) {
        this.storeBalance = storeBalance;
        this.availableGoods=new HashMap<Product, Integer>();
        this.warehouse = new HashMap<String, Product>();
    }

    public void openForBusiness(){
        System.out.println("We're open come on in!!");
        String item="Meat";
        Product meat= new Meat("Meat", 5, 10,"fillet ", "Bison");
        buyFromSupplier(meat);
        addToWareHouse(item, meat);
        addToStore(item,10);
        System.out.println(this);
        removeFromStore("Meat");
        System.out.println(this);
    }

    public void addToWareHouse(String item, Product product){
        warehouse.put(item,product);
    }

    public void addToStore(String item, int price){
        availableGoods.put(warehouse.get(item), price);
    }

    public void removeFromStore(String item){
        availableGoods.remove(item);
    }

    public void buyFromSupplier(Product product){
       storeBalance-=product.getSupplierCost();
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
