package com.androsor.basic_of_oop.task5.view;

public class UserRequest {

    String nameAndCountFlower;
    String namePack;

    public UserRequest(String nameAndCountFlower, String namePack) {
        this.nameAndCountFlower = nameAndCountFlower;
        this.namePack = namePack;
    }

    public String getNameAndCountFlower() {
        return nameAndCountFlower;
    }

    public String getNamePack() {
        return namePack;
    }
}
