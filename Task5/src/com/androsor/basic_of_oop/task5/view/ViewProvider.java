package com.androsor.basic_of_oop.task5.view;

public class ViewProvider {

    private static final ViewProvider instance = new ViewProvider();
    private View consoleViewer  = new ConsoleViewImpl();


    public ViewProvider() {
    }

    public static ViewProvider getInstance() {
        return instance;
    }

    public View getConsoleViewer() {
        return consoleViewer;
    }

    public void setConsoleViewer(View consoleViewer) {
        this.consoleViewer = consoleViewer;
    }
}
