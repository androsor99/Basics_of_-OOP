package com.androsor.basic_of_oop.task2.main;

import com.androsor.basic_of_oop.task2.entity.Payment;
import com.androsor.basic_of_oop.task2.entity.Product;
import com.androsor.basic_of_oop.task2.viewer.PaymentViewer;

public class Runner {

    public static void main(String[] args) {

        Payment newPayment = new Payment();
        PaymentViewer viewer = new PaymentViewer();

        Product product1 = new Product.ProductBuilder()
                .name("Вилька")
                .price(10)
                .vendorCode(111)
                .build();

        Product product2 = new Product.ProductBuilder()
                .name("Тарелька")
                .price(20)
                .vendorCode(222)
                .build();

        Product product3 = new Product.ProductBuilder()
                .name("Батарелька")
                .price(30)
                .vendorCode(333)
                .build();

        newPayment.addProducts(product1);
        newPayment.addProducts(product2);
        newPayment.addProducts(product3);

        viewer.showInfoAboutPayment(newPayment);
    }
}
