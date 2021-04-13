package com.streamliner;

import com.streamliners.models.Product;
import com.streamliners.models.Variant;
import com.streamliners.models.VarientsBasedProduct;
import com.streamliners.models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        // Create Products
        Product apple = new WeightBasedProduct("Apple", "", 1, 100);
        Product kiwi = new VarientsBasedProduct("Kiwi", "", new ArrayList<>(
                Arrays.asList(
                        new Variant("570g", 65)
                        , new Variant("1Kg", 180)
                )
        ));
        // Add them in a list
        List<Product> p = new ArrayList<>(
                Arrays.asList(apple, kiwi)
        );
        System.out.println(p);
    }
}

