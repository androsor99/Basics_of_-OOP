package com.androsor.basic_of_oop.task5.entity.pack;

public enum  PackType {

    BOX("Коробка", 15.50),
    BASKET("Карзина", 10.10),
    FELT("Фетр", 8.80),
    PAPER("Бумажная", 5.55);
    //WITHOUT_PACKAGING("Без упоковки", 0);

    private final String name;
    private final double price;

    PackType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public static PackType getPackTypeByName(String name) {

        for (PackType item : PackType.values()) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("'").append(name).append("'");
        sb.append(" - ").append(price).append(" $");
        return sb.toString();
    }
}
