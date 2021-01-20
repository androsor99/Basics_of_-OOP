package com.androsor.basic_of_oop.task5.entity.flower;

public enum FlowerType {

    ROSE("Роза", 7.70),
    CARNATION("Гвоздика", 6.60),
    TULIP("Тюльпан", 5.50),
    IRISES("Ирисы", 4.40),
    CHRYSANTHEMUM("Хризонтема", 3.30),
    CHAMOMILE("Ромашишка", 2.20);

    private final String name;
    private final double price;


    FlowerType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }


    public static FlowerType getFlowerTypeByName(String name) {

        for (FlowerType item : FlowerType.values()) {
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
