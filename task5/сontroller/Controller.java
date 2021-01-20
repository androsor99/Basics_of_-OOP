package com.androsor.basic_of_oop.task5.сontroller;

/**
 * Unified interface for Controllers.
 */
public interface Controller {

    /**
     * Lists commands for user input.
     */
    void getAllCommand();

    /**
     * Lists flowers with full descriptions.
     */
    void getFlowerDescription();

    /**
     * Lists packing with full descriptions.
     */
    void getPackDescription();

    /**
     * Displays a bouquet and its description created at the user's request.
     */
    void getFlowerComposition();
}
