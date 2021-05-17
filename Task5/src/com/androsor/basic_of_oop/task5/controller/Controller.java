package com.androsor.basic_of_oop.task5.controller;

public interface Controller {

    /**
     * performs an action based on the received request from the user.
     * @param request request from user.
     * @return formatting string.
     */
    public String doAction(String request);
    // request - "commandName name="nameBouquet" packaging="namePackaging" "nameFlowers1=quantity;nameFlowers2=quantity....."
    // response - formatting string
}
