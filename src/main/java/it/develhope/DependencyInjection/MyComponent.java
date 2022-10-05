package it.develhope.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Karina Alejandra Kosovan";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}
