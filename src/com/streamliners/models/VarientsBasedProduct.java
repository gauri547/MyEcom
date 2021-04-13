package com.streamliners.models;

import java.util.List;

public class VarientsBasedProduct extends Product {
    List<Variant> variants;

    public VarientsBasedProduct(String name, String imageURL,List<Variant> variants) {
        super(name, imageURL);
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "VarientsBasedProduct{" +
                "name='" + name + '\'' +
                ", imageURL=" + imageURL + '\'' +
                ", variants =" + variants + '\'' +
                '}';
    }
}
