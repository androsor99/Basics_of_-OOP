package com.androsor.basic_of_oop.task5.view;

import com.androsor.basic_of_oop.task5.entity.BouquetOffFlowers;
import com.androsor.basic_of_oop.task5.entity.Product;

public class ConsoleViewImpl implements View {
    @Override
    public String printDescriptionOfBouquet(BouquetOffFlowers bouquet) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ваш букет:\n");
        sb.append("Название - ").append(bouquet.getName());
        sb.append("\nВид упаковки - '").append(bouquet.getPack().getName()).append("'.\n");
        for (Product flower : bouquet.getFlowers().keySet()){
            if (flower == null) continue;
            sb.append('\'').append(flower.getName()).append('\'');
            sb.append(" - ").append(bouquet.getFlowers().get(flower)).append(" шт.,\n");
        }
        sb.append("Общая стоимость - ").append(String.format("%.2f", bouquet.getPrice()));
        sb.append(" $.");
        return sb.toString();
    }
}
