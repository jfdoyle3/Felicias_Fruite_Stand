package com.company;

public class Meat extends Product {

    //TODO need to be more descriptive on this
    private String cutStyle;
    private String animal;

    public Meat(String type, int inventoryAmount, String cutStyle, String animal) {
        super(type, inventoryAmount);
        this.cutStyle = cutStyle;
        this.animal = animal;
    }

    public String toString() {
        return "Meat: " + "Animal: " + animal + ", cutStyle: " + cutStyle;
    }
}