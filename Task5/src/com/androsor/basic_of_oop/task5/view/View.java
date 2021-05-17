package com.androsor.basic_of_oop.task5.view;

import com.androsor.basic_of_oop.task5.entity.BouquetOffFlowers;

public interface View {

    /**
     * Prints information about the created bouquet.
     * @param bouquet class object BouquetOffFlowers.
     * @return formatting string
     */
    String printDescriptionOfBouquet(BouquetOffFlowers bouquet);
}
