package com.androsor.basic_of_oop.task5.creator;

import com.androsor.basic_of_oop.task5.entity.FlowerComposition;
import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.entity.pack.Pack;
import com.androsor.basic_of_oop.task5.factory.ObjectFactory;
import com.androsor.basic_of_oop.task5.view.ConsoleHelper;
import com.androsor.basic_of_oop.task5.view.UserRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompositionCreatorImp implements CompositionCreator {

    private final Creator flowerCreator;
    private final Creator packCreator;

    public static final Pattern REQUEST_PATTERN = Pattern.compile("(?<name>[а-яА-ЯёЁ]+)[-]*(?<number>\\d+)*");

    public CompositionCreatorImp() {
        this.flowerCreator = ObjectFactory.INSTANCE.crateObject(FlowerCreator.class);
        this.packCreator = ObjectFactory.INSTANCE.crateObject(PackCreator.class);
    }

    @Override
    public Map<Product, Integer> createFlowers(String name) {

        Map<Product, Integer> flowers = new HashMap<>();
        List<Order> orders = parseStringFlowers(name);

        for (Order order : orders) {
            try {
                Product flower = flowerCreator.createProduct(order.name);
                addProducts(flower, order.count, flowers);
            } catch (NullPointerException e){
                ConsoleHelper.writeMessage(e.getMessage());
            }
        }
        return flowers;
    }

    private void addProducts (Product product, Integer count, Map<Product, Integer> map) {

        if (map.containsKey(product)) {
            map.put(product, (count + map.get(product)));
        } else {
            map.put(product, count);
        }
    }

    @Override
    public  Pack createPack(String name) {

        Pack pack = new Pack();
        if (!(name.trim()).equals("")) {
            try {
                pack = (Pack) packCreator.createProduct(name);
            } catch (NullPointerException e) {
                ConsoleHelper.writeMessage(e.getMessage());
            }
        }
        return pack;
    }

    @Override
    public Product createFlowerComposition(UserRequest userRequest) {
        return new FlowerComposition(createFlowers(userRequest.getNameAndCountFlower()), createPack(userRequest.getNamePack()));
    }


    private List<Order> parseStringFlowers(String name){

        Matcher matcher = REQUEST_PATTERN.matcher(name);
        List<Order> orders = new ArrayList<>();

        while (matcher.find()){
            int count = 1;
            String string = matcher.group("name");

            try {
                count = Integer.parseInt(matcher.group("number"));
            } catch (NumberFormatException e){
                    // Does nothing.
            }
            orders.add(new Order(string, count));
        }
        return orders;
    }

    static private class Order {

        String name;
        int count;

        public Order(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }
}
