package it.develhope.DependencyInjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("MyController constructor be called");
    }

    @GetMapping("/getName")
    public String getName() {
        System.out.println("MyController.getName() has been called");
        return myService.getName();
    }

    @GetMapping("/")
    public String welcome() {
        System.out.println("MyController welcome method has been called");
        return "Welcome to my exercise";
    }

}
