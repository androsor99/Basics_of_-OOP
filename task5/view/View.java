package com.androsor.basic_of_oop.task5.view;

/**
 * Unified interface for views.
 */
public interface View {

    /**
     * Print a list of commands for user input.
     */
    void printAllCommand();

    /**
     * Returns user request.
     * @return {@link UserRequest}
     */
    UserRequest getUserRequest();

    /**
     * Returns a description of flowers
     */
    void printFlowerDescription();

    /**
     * Returns packaging description.
     */
    void printPackDescription();

}
