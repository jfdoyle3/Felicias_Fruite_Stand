package com.company.products;

import com.company.store.Store;

public class Product {

    //TODO need to be more descriptive on this
    protected String type;
    protected int inventoryAmount;
    protected long supplierCost;

    public Product(String type, int inventoryAmount, long supplierCost) {
        this.type = type;
        this.supplierCost=supplierCost;
        this.inventoryAmount = inventoryAmount;
    }

    public long getSupplierCost() {
        return supplierCost;
    }

    public int getInventoryAmount() {
        return inventoryAmount;
    }

    public void updateInventory(int qty){
        this.inventoryAmount=qty;
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
