package com.androsor.basic_of_oop.task5.controller.command.impl;

import com.androsor.basic_of_oop.task5.controller.command.Command;
import com.androsor.basic_of_oop.task5.entity.BouquetOffFlowers;
import com.androsor.basic_of_oop.task5.service.BouquetService;
import com.androsor.basic_of_oop.task5.service.ServiceException;
import com.androsor.basic_of_oop.task5.service.ServiceProvider;
import com.androsor.basic_of_oop.task5.view.View;
import com.androsor.basic_of_oop.task5.view.ViewProvider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateBouquetCommand implements Command {

    private final ServiceProvider serviceProvider = ServiceProvider.getInstance();
    private final ViewProvider viewProvider = ViewProvider.getInstance();
    public static final Pattern REQUEST_FLOWERS_PATTERN = Pattern.compile("(?<name>[а-яА-ЯёЁ]+)=*(?<number>\\d+)*");

    @Override
    public String execute(String[] parameters) throws ServiceException {
        BouquetService bouquetService = serviceProvider.getBouquetService();
        View viewer = viewProvider.getConsoleViewer();
        String response;
        String name = parameters[1].split("=")[1];
        String packaging = parameters[2].split("=")[1];
        String flowers = parameters[3];
        Matcher matcher = REQUEST_FLOWERS_PATTERN.matcher(flowers);
        BouquetOffFlowers result = bouquetService.create(name);
        bouquetService.toChangePackaging(result,packaging);
        while (matcher.find()) {
            String flowerName = matcher.group("name");
            int quantity = Integer.parseInt(matcher.group("number"));
            bouquetService.addFlower(result, flowerName, quantity);
        }
        response = viewer.printDescriptionOfBouquet(result);
        return response;
    }
}
