package com.company.products;

import com.company.products.Product;

public class Meat extends Product {

    //TODO need to be more descriptive on this
    private String cutStyle;
    private String animal;

    public Meat(String type, int inventoryAmount, int supplierCost, String cutStyle, String animal) {
        super(type, inventoryAmount, supplierCost);
        this.animal=animal;
        this.cutStyle=cutStyle;
    }

    public String getCutStyle() {
        return cutStyle;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "cutStyle='" + cutStyle + '\'' +
                ", animal='" + animal + '\'' +
                super.toString()+
                '}';
    }
}
