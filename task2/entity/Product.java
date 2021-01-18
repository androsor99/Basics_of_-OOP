package com.androsor.basic_of_oop.task2.entity;

import java.util.Objects;

public class Product {

    private final String name;
    private final double price;
    private final int vendorCode;

    public Product(ProductBuilder productBuilder) {
        this.name = productBuilder.getName();
        this.price = productBuilder.getPrice();
        this.vendorCode = productBuilder.getVendorCode();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                vendorCode == product.vendorCode &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, vendorCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vendorCode=" + vendorCode +
                '}';
    }

    public static class ProductBuilder {

        private String name = "";
        private double price = 0;
        private int vendorCode = 0;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder vendorCode(int vendorCode) {
            this.vendorCode = vendorCode;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getVendorCode() {
            return vendorCode;
        }

    }
}


