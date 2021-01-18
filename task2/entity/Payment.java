package com.androsor.basic_of_oop.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

    private List<Product> products;

    {
        products = new ArrayList<>();
    }

    public Payment() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean addProducts(Product product) {
        return products.add(product);
    }

    public boolean removeProducts(Product product) {
        return products.remove(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return products.equals(payment.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "products=" + products +
                '}';
    }
}