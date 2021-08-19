package com.company.products;

public class Product {

    //TODO need to be more descriptive on this
    protected String type;
    protected int inventoryAmount;
    protected int supplierCost;

    public Product(String type, int inventoryAmount, int supplierCost) {
        this.type = type;
        this.supplierCost=supplierCost;
        this.inventoryAmount = inventoryAmount;
    }

    public int getSupplierCost() {
        return supplierCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", inventoryAmount=" + inventoryAmount +
                ", supplierCost=" + supplierCost +
                '}';
    }
}
