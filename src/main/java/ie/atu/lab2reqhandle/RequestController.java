package ie.atu.lab2reqhandle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){

        return "Hello, " + name + "!";
    }
}
