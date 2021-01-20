package com.androsor.basic_of_oop.task5.factory;

public enum ObjectFactory {

    INSTANCE;

    private final Configuration configuration = new AppConfiguration();

    public <T> T crateObject(Class<T> obj) {

        Class implementation = null;
        implementation = configuration.getImplementation(obj);
        T instance = null;
        try {
            instance = (T) implementation.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
