package com.androsor.basic_of_oop.task5.creator;

import com.androsor.basic_of_oop.task5.entity.FlowerComposition;
import com.androsor.basic_of_oop.task5.entity.Product;
import com.androsor.basic_of_oop.task5.entity.flower.Flower;
import com.androsor.basic_of_oop.task5.entity.pack.Pack;
import com.androsor.basic_of_oop.task5.view.UserRequest;

import java.util.Map;

/**
 * Unified interface for Composition creators.
 */
public interface CompositionCreator {

    /**
     * Creates and returns a list of flowers for a flower arrangement.
     * @param name flower
     * @return Map of flowers class of {@link Flower}
     */
    Map<Product, Integer> createFlowers(String name);

    /**
     * Creates and returns packaging for a flower arrangement.
     * @param name packing
     * @return returns product class of {@link Pack}.
     */
    Pack createPack(String name);

    /**
     * Creates and returns a bouquet as requested by the user.
     * @param userRequest User request with the parameters necessary to create a bouquet {@link UserRequest}
     * @return returns the created bouquet {@link FlowerComposition}
     */
    Product createFlowerComposition(UserRequest userRequest);
}
