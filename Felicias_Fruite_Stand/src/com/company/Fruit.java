package com.company;

public class Fruit extends Product{

    //TODO need to be more descriptive on this
    private String fruitName;

    public Fruit(String type, int inventoryAmount, String fruitName){
        super(type, inventoryAmount);
        this.fruitName=fruitName;
    }


    public String toString() {
        return "Fruit: " + "name: " + fruitName;
    }
}
