package com.androsor.basic_of_oop.task2.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Payment {

    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private final int id;
    private final ZonedDateTime date;
    private String client = "default";
    private TypePayment type = TypePayment.CASH;
    private TypeCurrency currency = TypeCurrency.BLR;
    private List<Product> products = new ArrayList<>();

    public Payment() {
        this.id = idGenerator.getAndIncrement();
        this.date = ZonedDateTime.now();
    }

    public int getId() {
        return id;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public String getClient() {
        return client;
    }

    public TypePayment getType() {
        return type;
    }

    public TypeCurrency getCurrency() {
        return currency;
    }

    public List<Product> getProducts() {
        return products;
    }

    public BigDecimal getTotalPrice() {
        BigDecimal total = new BigDecimal("0");
        for (Product product : Objects.requireNonNull(this.products)) {
            total = total.add(product.getPrice()) ;
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && Objects.equals(date, payment.date) && Objects.equals(client, payment.client) && type == payment.type && currency == payment.currency && Objects.equals(products, payment.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, client, type, currency, products);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", date=" + date +
                ", client='" + client + '\'' +
                ", type=" + type +
                ", currency=" + currency +
                ", products=" + products +
                '}';
    }

    public static class PaymentBuilder {

        private final Payment newPayment;

        public PaymentBuilder() {
            this.newPayment = new Payment();
        }

        public PaymentBuilder withClient(String client) {
            newPayment.client = client;
            return this;
        }

        public PaymentBuilder withType(TypePayment type) {
            newPayment.type = type;
            return this;
        }

        public PaymentBuilder withCurrency(TypeCurrency currency) {
            newPayment.currency = currency;
            return this;
        }

        public PaymentBuilder withProducts(List<Product> products) {
            newPayment.products = products;
            return this;
        }

        public Payment build() {
            return newPayment;
        }

    }
}