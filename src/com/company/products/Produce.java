package com.company.products;

import com.company.products.Product;

public class Produce extends Product {

    //TODO need to be more descriptive on this
    private String produceName;

    public Produce(String type, int inventoryAmount, int supplierCost,String produceName) {
        super(type, inventoryAmount, supplierCost);
        this.produceName=produceName;
    }

    public String getProduceName() {
        return produceName;
    }

    @Override
    public String toString() {
        return "Produce{" +
                "produceName: '" + produceName + '\'' +
                ", type='" + type + '\'' +
                ", inventoryAmount: " + inventoryAmount +
                ", supplierCost=" + supplierCost +
                '}';
    }
}
