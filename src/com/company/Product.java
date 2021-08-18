package com.company;

public class Product {

    //TODO need to be more descriptive on this
    private String type;
    private int inventoryAmount;

    public Product(String type, int inventoryAmount) {
        this.type = type;
        this.inventoryAmount = inventoryAmount;
    }


    public String toString() {
        return "Product: " + "type:'" + type + ", inventoryAmount:" + inventoryAmount;
    }
}
