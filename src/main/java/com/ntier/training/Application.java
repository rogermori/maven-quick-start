package com.ntier.training;

public class Application {
    public Application() {
        System.out.println("Building instance");
    }

    @Override
    public String toString() {
        return "application";
    }

    public static void main(String[] args) {
        System.out.println("Application entry point");
        Application app = new Application();
        System.out.println(app.toString());

    }
}