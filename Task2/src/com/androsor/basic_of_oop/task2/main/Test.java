package com.androsor.basic_of_oop.task2.main;

import com.androsor.basic_of_oop.task2.entity.Payment;
import com.androsor.basic_of_oop.task2.entity.TypeCurrency;
import com.androsor.basic_of_oop.task2.entity.TypePayment;

import static com.androsor.basic_of_oop.task2.entity.IOHelper.generateProducts;
import static com.androsor.basic_of_oop.task2.entity.IOHelper.showPayment;

public class Test {

    public static void main(String[] args) {
        Payment payment = new Payment.PaymentBuilder()
               .withClient("Петруха")
               .withType(TypePayment.BANK_CARD)
               .withCurrency(TypeCurrency.USD)
               .withProducts(generateProducts())
               .build();

        showPayment(payment);
    }
}
