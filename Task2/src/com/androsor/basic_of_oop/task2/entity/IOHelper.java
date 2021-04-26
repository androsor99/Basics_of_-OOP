package com.androsor.basic_of_oop.task2.entity;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static java.lang.String.format;

public class IOHelper {

    private static final Random random = new Random();
    private static final List<String> namesProduct = Arrays.asList("Вилька", "Тарелька", "Батарелька", "Сол", "Фасол");

    public static List<Product> generateProducts() {
        List<Product> products = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            products.add(new Product(namesProduct.get(random.nextInt(5)),
                    new BigDecimal(random.nextInt(10000)),
                    random.nextInt(1000000)));
        }
        return products;
    }

    public static void showPayment(Payment payment) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy г., HH:mm:ss", new Locale("ru", "RU"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format("№ - %d\n", payment.getId()))
                .append(format("%s\n", payment.getDate().format(dateFormat)))
                .append(format("Плательщик - %s\n", payment.getClient()))
                .append(format("%s\n", payment.getType().getType()))
                .append(format("Валюта - %s\n", payment.getCurrency().getCurrency()))
                .append(getProductsToString(payment.getProducts()))
                .append(format("Сумма - %s", payment.getTotalPrice().toString()));
        show(stringBuilder.toString());
    }

    public static String getProductsToString(List<Product> products) {
        StringBuilder stringBuilder = new StringBuilder();
        products.forEach(product -> stringBuilder.append(format("%5d", products.indexOf(product) + 1))
                .append(format("%15s:", product.getName()))
                .append(format("%6s", product.getPrice().toString()))
                .append(format("%10d\n", product.getVendorCode())));
        return stringBuilder.toString();
    }

    private static void show (String line) {
        System.out.println(line);
    }
}
