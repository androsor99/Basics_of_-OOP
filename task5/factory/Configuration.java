package com.androsor.basic_of_oop.task5.factory;

import java.util.Map;

/**
 * Unified interface for configurations.
 */
public interface Configuration {

    /**
     * Returns implementation by interface membership.
     * @param obj class belonging to the interface
     * @return a specific implementation of the interface
     */
    Class getImplementation(Class obj);
}
