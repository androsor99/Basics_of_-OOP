package com.androsor.basic_of_oop.task5.factory;

import com.androsor.basic_of_oop.task5.creator.CompositionCreator;
import com.androsor.basic_of_oop.task5.creator.CompositionCreatorImp;
import com.androsor.basic_of_oop.task5.creator.FlowerCreator;
import com.androsor.basic_of_oop.task5.creator.PackCreator;
import com.androsor.basic_of_oop.task5.view.ViewImpl;
import com.androsor.basic_of_oop.task5.view.View;
import com.androsor.basic_of_oop.task5.сontroller.Controller;
import com.androsor.basic_of_oop.task5.сontroller.ControllerImp;

import java.util.HashMap;
import java.util.Map;

public class AppConfiguration implements Configuration {

    private final Map<Class, Class> interfaceToClass = new HashMap<>();

    public AppConfiguration() {

        interfaceToClass.put(FlowerCreator.class, FlowerCreator.class);
        interfaceToClass.put(PackCreator.class, PackCreator.class);
        interfaceToClass.put(View.class, ViewImpl.class);
        interfaceToClass.put(Controller.class, ControllerImp.class);
        interfaceToClass.put(CompositionCreator.class, CompositionCreatorImp.class);
    }

    @Override
    public Class getImplementation(Class obj) {
        return interfaceToClass.get(obj);
    }
}
