package com.streamliners.models;

import java.util.Objects;

public class Product {
    String name;
    String imageURL;

    public Product(String name,String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(imageURL, product.imageURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageURL);
    }
}
