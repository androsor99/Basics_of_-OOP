package com.androsor.basic_of_oop.task2.viewer;

import com.androsor.basic_of_oop.task2.entity.Payment;
import com.androsor.basic_of_oop.task2.entity.Product;
import com.androsor.basic_of_oop.task2.logic.PaymentCost;

public class PaymentViewer {

    PaymentCost paymentCost = new PaymentCost();

    public void showInfoAboutPayment(Payment payment) {
        System.out.println("Отчет о покупке");
        int i = 1;
        for(Product prod : payment.getProducts()) {
            System.out.printf("%d - %d;\t\"%s\"\tцена = %.2f р.;\n", i, prod.getVendorCode(), prod.getName(), prod.getPrice());
            i++;
        }
        System.out.printf("Приобретено \"%d\" товара(ов) общей стоимостью - %.2f р.", payment.getProducts().size(), paymentCost.paymentCost(payment));
    }
}
