package ie.atu.lab2reqhandle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/details")
    public String details(@RequestParam String name, int age){
        //http://localhost:8080/details?age=33&name=gavin
        return "Hello, " + name + ", Aged " + age + "!";
    }
}
