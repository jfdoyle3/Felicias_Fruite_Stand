package com.company;

import com.company.console.Console;
import com.company.products.Produce;
import com.company.products.Meat;
import com.company.products.Product;
import com.company.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Store market=new Store();
        market.openForBusiness();
        // market.basicStore();
    }
}
