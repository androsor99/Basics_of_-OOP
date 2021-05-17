package com.androsor.basic_of_oop.task4.view;

import com.androsor.basic_of_oop.task4.view.Impl.ConsoleViewerImpl;

public final class ViewerProvider {

    private final static ViewerProvider instance = new ViewerProvider();
    private Viewer viewer = new ConsoleViewerImpl();

    public ViewerProvider() {
    }

    public static ViewerProvider getInstance() {
        return instance;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
}
