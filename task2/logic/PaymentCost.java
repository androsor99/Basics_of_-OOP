package com.androsor.basic_of_oop.task2.logic;

import com.androsor.basic_of_oop.task2.entity.Payment;
import com.androsor.basic_of_oop.task2.entity.Product;

public class PaymentCost {

    public double paymentCost(Payment payment) {
        double totalCost = 0;

        for(Product prod : payment.getProducts()) {
            totalCost += prod.getPrice();
        }
        return totalCost;
    }
}
