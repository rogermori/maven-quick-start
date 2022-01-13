package com.ntier.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public Application() {
        System.out.println("Building instance");
    }

    @Override
    public String toString() {
        return "application";
    }

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for (String greeting : greetings) {
            System.out.println("Greeting : " + greeting);
        }
    }

    public static void main(String[] args) {
        System.out.println("Application entry point");
        Application app = new Application();
        app.greet();
    }
}